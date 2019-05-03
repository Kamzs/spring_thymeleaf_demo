package pl.Kams.kams_app_oskarpolak.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.Kams.kams_app_oskarpolak.Models.Person;
import pl.Kams.kams_app_oskarpolak.Models.SimpleBean;

import java.time.LocalDateTime;
import java.time.Period;

@Controller
public class MainController
{


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String zwroccokolwiekGET(Model model)
    {
        LocalDateTime now = LocalDateTime.now();

        if (now.getHour() >= 16)
        {
            model.addAttribute("danazKontrolera", "przykładowa wartość A przesłana przez kontroler");
        } else
        {
            model.addAttribute("danazKontrolera", "B");
        }
        return "Index";
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    @ResponseBody
    public String zwroccokolwiekPUT()
    {
        return "dziala mapping";
    }


    @Autowired
    SimpleBean simpleBean;

    @RequestMapping(value = "/key", method = RequestMethod.GET)
    @ResponseBody
    public String zwroctTenKluczZWygenerowanyPrzezBeanGET()
    {
        return simpleBean.generateKeyRandom();
    }


    @RequestMapping(value = "/data", method = RequestMethod.POST)
    @ResponseBody
    public String obsluzZapytaniePostpodURLdata(@RequestParam(value = "name", required = false) String incomingText)
    {
        return "otrzymany parameter to: " + incomingText;
    }


    @RequestMapping(value = "/data2", method = RequestMethod.POST)
    @ResponseBody
    public String obsluzZapytaniePostpodURLdata2(
            @RequestParam(value = "imie") String imie,
            @RequestParam(value = "nazwisko") String nazwisko,
            @RequestParam(value = "wiek") int wiek
    )
    {
        String isAdult;

        if (wiek >= 18)
        {
            isAdult = "jest pełnoletni";
        } else
        {
            isAdult = "nie jest pełnoletni";
        }

        return
                imie +
                        " " +
                        nazwisko +
                        " " +
                        isAdult;

    }

    @RequestMapping(value = "/showform", method = RequestMethod.GET)
    public String fullform(Model model)
    {
        model.addAttribute("personObject", new Person());
        return "Fullform";
    }


    //builder
    private void testBuilder()
    {
        Person person = new Person.Builder("kams")
                .age(25)
                .email("kam@gmial.com")
                .lastname("Ambro")
                .build();

    }




}
