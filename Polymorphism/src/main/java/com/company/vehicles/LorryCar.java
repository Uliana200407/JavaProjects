package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class LorryCar extends Car {
    private double lifting;

    public LorryCar(String brand, String carClass, double weight, Driver driver, Engine engine) {
        super(brand, carClass, weight, driver, engine);
        this.lifting = lifting;
    }

    public double getLifting() {
        return lifting;
    }

    public void setLifting(double lifting) {
        this.lifting = lifting;
    }

    @Override
    public String toString() {
        return "LorryCar{" +
                "lifting=" + lifting +
                "} " + super.toString();
    }
}