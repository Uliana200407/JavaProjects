package com.tommy.java.basic.phoneExample.entities;

import com.tommy.java.basic.phoneExample.Phone;

public class Nokia extends Phone {

    String color;

    public Nokia(String namePhone, String modelPhone, int sizeStorage, int sizeRAM, String color) {
        super(namePhone, modelPhone, sizeStorage, sizeRAM);
        this.color = color;
    }

    @Override
    public void call(String phoneNumber) {
        System.out.println("I'am calling from Nokia to: " + phoneNumber);
    }

    @Override
    public void sendMessage(String phoneNumber, String textMessage) {
        System.out.printf("I'm send message \"%s\" to %s from Nokia \n", textMessage, phoneNumber);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
