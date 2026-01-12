package com.hano.springboot.demo.myApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {

    @Value(" ${coach.name}")
    private String coachName;

    @Value(" ${team.name} ")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team: " + teamName;
    }

    // expose '/' that return helloWorld
    @GetMapping("/")
    public String helloWorld() {
        return "Hello, World!";
    }

    //expose a new endpoint for workout
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Ran a hard 5k";
    }
}
