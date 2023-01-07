package org.example.Info;


import org.example.TypesOfTaxi.Taxi;

public class DriverInfo{
    public String name;
    public String lastName;
    public Taxi car;


    public DriverInfo(String name, String lastName,Taxi car) {
        this.name = name;
        this.lastName = lastName;
        this.car = car;
    }
}

