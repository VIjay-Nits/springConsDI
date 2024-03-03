package com.example.constructorDI.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.constructorDI.Coach;

@RestController
public class DemoController {


    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("tennisCoach") Coach myCoach){
        this.myCoach=myCoach;
    }
    

    @GetMapping("/abc")
    public String getWorkout(){
        return myCoach.workout();
    }
    
}
