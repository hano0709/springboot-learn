package com.hano.springboot.demo.myApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {

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
