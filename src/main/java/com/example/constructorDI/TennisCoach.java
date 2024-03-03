package com.example.constructorDI;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Override
    public String workout() {
        return "This is Tennis Coach";
    }

}
