package com.tommy.java.basic.carExample.vehicles;


import com.tommy.java.basic.carExample.details.Engine;
import com.tommy.java.basic.carExample.professions.Driver;

public class Lorry extends Car {
    private double liftingCapacity;

    public Lorry(String producer, String aClass, double weight, Driver driver, Engine engine, double liftingCapacity) {
        setProducer ( producer );
        setaClass ( aClass );
        setWeight ( weight );
        setDriver ( driver );
        setEngine ( engine );
        this.liftingCapacity = liftingCapacity;
    }

    public double getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(double liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "liftingCapacity=" + liftingCapacity +
                "} " + super.toString();
    }
}
