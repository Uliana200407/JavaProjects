package com.tommy.java.basic.carExample.vehicles;

import com.tommy.java.basic.carExample.details.Engine;
import com.tommy.java.basic.carExample.professions.Driver;

import java.awt.*;

import static java.awt.Color.green;
import static java.awt.Color.red;

public class Car {
    private Color lightColour;
    private String producer;
    private String aClass;
    private double weight;
    private Driver driver;
    private Engine engine;
    private Boolean state;
    private String turn;
    private String options;




    public void setTurn(String newTurn){
        this.turn = newTurn;
    }
    public void setOptions(String newOptions){
        this.options =newOptions ;
    }

    public void turnCar(){
        if(this.turn == "turnRight"){
            turn ="turnRight";
        }else{
            turn = "turnLeft";}
        }
    public void trunkOptions(){
        if(this.options == "Opened trunk"){
            options ="Opened trunk";
        }else{
            options = "Closed trunk";}
    }
    public void trunkOpen() {
        this.options = "The trunk is opened";
    }
    public void trunkClose() {
        this.options = "The trunk is closed";
    }
    public void typeOfDriveSport() {
        System.out.println ("Your drive option is Sport");
    }
    public void typeofDriveUrban(){
        System.out.println ("Your drive option is Urban");
    }
    public void turnR() {
        this.turn = "turnRight";
    }
    public void turnL() {
        this.turn = "turnLeft";
    }

    public void changerHeadlights() {
        if(this.state == true) {
            state = true;
        } else {
            state = false;
        }
    }
    public void changerBlackLight() {
        if(this.lightColour == red) {
            lightColour = red;
        } else {
            lightColour = green;
        }
    }

    public void offReD() {
        this.lightColour = red;
    }
    public void onGreen() {
        this.lightColour = green;
    }
    public void on() {
        this.state = true;
    }

    public void off() {
        this.state = false;
    }



        public void setProducer(String newProducer){
            this.producer = newProducer;
        }

        public void setAClass(String newAClass){
            this.aClass = newAClass;
        }

public void setLightColour(Color newColour){
        this.lightColour = lightColour;
}
    public void setLightState(Boolean newState){
        this.state = state;
    }

        public void setDriver(Driver newDriver){
            this.driver = newDriver;
        }

        public String getProducer() {
            return producer;
        }


        public String getaClass() {
            return aClass;
        }

        public void setaClass(String aClass) {
            this.aClass = aClass;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public Driver getDriver() {
            return driver;
        }

        public Engine getEngine() {
            return engine;
        }

        public void setEngine(Engine engine) {
            this.engine = engine;
        }

        public void start() {
            System.out.println("Поехали");
        }

        public void stop() {
            System.out.println("Останавливаемся");
        }

        public void turnRight() {
            System.out.println("Поворот направо");
        }

        public void turnLeft() {
            System.out.println("Поворот налево");
        }



    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", aClass='" + aClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
         String.format( "/status of lights : " + this.state + " , " + this.lightColour + ", " + this.turn +" ,"+this.options);
    }

}
