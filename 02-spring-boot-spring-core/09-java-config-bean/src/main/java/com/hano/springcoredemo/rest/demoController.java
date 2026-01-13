package com.hano.springcoredemo.rest;

import com.hano.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

    private Coach myCoach;

    @Autowired
    public demoController( @Qualifier("aquatic") Coach theCoach ) {
        myCoach = theCoach;

        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
