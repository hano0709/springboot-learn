package com.hano.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class cricketCoach implements Coach{

    public cricketCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 15 minutes :)";
    }
}
