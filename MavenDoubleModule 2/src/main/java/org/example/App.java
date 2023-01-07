package org.example;

import org.example.Info.DriverInfo;
import org.example.TypesOfTaxi.Taxi;
import org.example.TypesOfTaxi.Uber;
import org.example.TypesOfTaxi.Uklon;

import java.util.List;

public class App
{
    static List < DriverInfo > driverInfoList =  List.of(
            new DriverInfo ( "Andrey","Laus",
                    new Uklon ("Economy",34) ),
            new DriverInfo ( "Alex","Rayson",
                    new Uber ("Economy",56) ),
            new DriverInfo ( "Paul","Shnider",
                    new Uber("VIP",100) )
    );

    public static void main( String[] args ) {
        Taxi Uklon = new Taxi ( "Economy" );
        Taxi Uber = new Taxi ( "VIP" );

        System.out.println ( "Is taxi Uklon before start() call:" + Uklon.isAlive () );
        System.out.println ( "Is taxi Uber before start() call:" + Uber.isAlive () );
        Uklon.start ();
        try {
            Uber.sleep ( 2 );
        } catch (InterruptedException e) {
            throw new RuntimeException ( e );
        }

        System.out.println ( "Is taxi Uklon after start() call:" + Uklon.isAlive () );
        System.out.println ( "Is taxi Uklon after start() call:" + Uber.isAlive () );
        System.out.println ("\n");
        for ( DriverInfo driver : driverInfoList ) {
            System.out.println (driver.name + " " + driver.lastName + " is your driver today");
            driver.car.CalculatePrice();
        }
    }
}


