package com.company.details;

public class Engine {
    private int power;
    private String developer;

    public Engine(int power, String developer) {
        this.power = power;
        this.developer = developer;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power='" + power + '\'' +
                ", developer='" + developer + '\'' +
                '}';

    }
}


