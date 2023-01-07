package org.example;

import org.example.Info.DriverInfo;
import org.example.TypesOfTaxi.Uber;
import org.example.TypesOfTaxi.Uklon;
import java.util.List;

public class LaunchDriverInfo {
    static List < DriverInfo > driverInfoList = List.of (
            new DriverInfo ( "Max", "Rolson",
                    new Uklon ( "Economy", 34 ) ),
            new DriverInfo ( "Andreu", "Parchomenko",
                    new Uber ( "Economy", 56 ) ),
            new DriverInfo ( "Anastasii", "Vecherkovskaya",
                    new Uber ( "VIP", 100 ) )
    );

    public static void main(String[] args) {
        for (DriverInfo driver : driverInfoList) {
            System.out.println ( driver.name + " " + driver.lastName + " is your driver today" );

        }
    }
}