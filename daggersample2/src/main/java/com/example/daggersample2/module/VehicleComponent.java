package com.example.daggersample2.module;

import com.example.daggersample2.model.Vehicle;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by umshaik on 12/26/16.
 */
@Singleton
@Component(
        modules = {
                VehicleModule.class})
public interface VehicleComponent {
    Vehicle provideVehicle();
}
