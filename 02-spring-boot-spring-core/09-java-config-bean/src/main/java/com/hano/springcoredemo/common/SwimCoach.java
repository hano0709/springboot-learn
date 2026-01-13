package com.hano.springcoredemo.common;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.print("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warmup";
    }
}
