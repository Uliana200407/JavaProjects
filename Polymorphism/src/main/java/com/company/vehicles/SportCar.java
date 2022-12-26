package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private float speed;
    public SportCar(String brand, String carClass, double weight, Driver driver, Engine engine) {
        super(brand, carClass, weight, driver, engine);
this.speed = speed;
    }
    public float getSpeed(){
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
    @Override
    public String toString(){
        return "SportCar{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}
