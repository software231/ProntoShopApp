package com.example.daggersample2.model;

/**
 * Created by umshaik on 12/22/16.
 */

public class Motor {

    private int rpm;

    public Motor(){
        this.rpm = 0;
    }

    public int getRpm(){
        return rpm;
    }

    public void accelerate(int value){
        rpm = rpm + value;
    }

    public void brake(){
        rpm = 0;
    }
}