package com.example.daggersample2.model;

import javax.inject.Inject;

/**
 * Created by umshaik on 12/22/16.
 */

public class Vehicle {

    private Motor motor;

    @Inject
    public Vehicle(Motor motor){
        this.motor = motor;
    }

    public void increaseSpeed(int value){
        motor.accelerate(value);
    }

    public void stop(){
        motor.brake();
    }

    public int getSpeed(){
        return motor.getRpm();
    }
}