package com.example.constructorDI;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String workout() {
        return "This is Cricket Coach";
    }

}
