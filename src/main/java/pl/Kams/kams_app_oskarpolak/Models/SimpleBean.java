package pl.Kams.kams_app_oskarpolak.Models;


import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SimpleBean
{
    public String generateKeyRandom()
    {
        return UUID.randomUUID().toString();
    }


}
