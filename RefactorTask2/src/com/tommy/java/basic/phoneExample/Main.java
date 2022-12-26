package com.tommy.java.basic.phoneExample;

import com.tommy.java.basic.phoneExample.entities.Nokia;
import com.tommy.java.basic.phoneExample.entities.Samsung;

public class Main {

    public static void main(String[] args) {

        Nokia nokiaPhone = new Nokia("Nokia", "3310", 24,1, "Black");
        Samsung samsungPhone = new Samsung("Samsung", "S21",
                128, 8, 32, "Moondast black");


        nokiaPhone.call("38093232323");
        samsungPhone.call("38093232323");

        samsungPhone.takePhoto();
        //nokiaPhone.takePhoto(); error because Nokia not implement PhoneMedia interface

        samsungPhone.sendMessage("38093232323","Hello dear!)");
        nokiaPhone.sendMessage("38093232323","Hello dear!)");
    }

}
