package pl.Kams.kams_app_oskarpolak.Models;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


public class Person

{

    @NotEmpty
    private String name;


    private String lastname;


    private int age;


    private String number;


    private String email;

    public Person(){};

    private Person(Builder builder)
    {
        name = builder.name;
        lastname = builder.lastname;
        age = builder.age;
        number = builder.number;
        email = builder.email;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public static class Builder
    {


        private String name;
        private String lastname;
        private int age;
        private String number;
        private String email;

        public Builder(String name)
        {
            this.name = name;
        }

        public Builder lastname (String lastname)
        {
            this.lastname = lastname;
            return this ;
        }

        public Builder age (int age)
        {
            this.age = age ;
            return this ;
        }

        public Builder number (String number )
        {
            this.number = number ;
            return this ;
        }

        public Builder email (String email )
        {
            this.email = email ;
            return this ;
        }

        public Person build()
        {
            return new Person(this);
        }


    }


}
