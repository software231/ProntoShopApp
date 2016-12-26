package com.example.daggersample2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.daggersample2.model.Vehicle;
import com.example.daggersample2.module.DaggerVehicleComponent;
import com.example.daggersample2.module.VehicleComponent;
import com.example.daggersample2.module.VehicleModule;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VehicleComponent vehicleComponent= DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();

        Vehicle vehicle = vehicleComponent.provideVehicle();

        Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();
    }
}
