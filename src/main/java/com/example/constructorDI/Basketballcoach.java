package com.example.constructorDI;

import org.springframework.stereotype.Component;

@Component
public class Basketballcoach implements Coach {

    @Override
    public String workout() {
        return "This is Basketball Coach";
    }

}
