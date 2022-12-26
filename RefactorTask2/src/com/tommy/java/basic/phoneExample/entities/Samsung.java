package com.tommy.java.basic.phoneExample.entities;

import com.tommy.java.basic.phoneExample.Phone;
import com.tommy.java.basic.phoneExample.interfaces.PhoneMedia;

public class Samsung extends Phone implements PhoneMedia {

    private int cameraMegapixels;
    String color;

    public Samsung(String namePhone, String modelPhone, int sizeStorage, int sizeRAM, int cameraMegapixels, String color) {
        super(namePhone, modelPhone, sizeStorage, sizeRAM);
        this.cameraMegapixels = cameraMegapixels;
        this.color = color;
    }

    public int getCameraMegapixels() {
        return cameraMegapixels;
    }

    public void setCameraMegapixels(int cameraMegapixels) {
        this.cameraMegapixels = cameraMegapixels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void call(String phoneNumber) {
        System.out.println("I'am calling from Samsung to: " + phoneNumber);
    }

    @Override
    public void sendMessage(String phoneNumber, String textMessage) {
        System.out.printf("I'm send message \"%s\" to %s from Samsung \n", textMessage, phoneNumber);
    }

    @Override
    public void takePhoto() {
        System.out.println("I'm take a photo by Samsung");
    }

    @Override
    public void recordVideo() {
        System.out.println("I'm record video by Samsung");
    }


}
