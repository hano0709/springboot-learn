package com.hano.demo.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class cricketCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 15 minutes";
    }
}
