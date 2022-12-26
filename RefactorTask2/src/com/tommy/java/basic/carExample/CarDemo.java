package com.tommy.java.basic.carExample;
import com.tommy.java.basic.carExample.details.Engine;
import com.tommy.java.basic.carExample.professions.Driver;
import com.tommy.java.basic.carExample.vehicles.*;
import java.util.Scanner;

import static java.lang.System.exit;

public class CarDemo  {
    public static void main(String[] args) {
        chooseCarOption ();
        Driver bmwDriver = new Driver("Иванов В.В.", 50,  30);
        Engine bmwEngine = new Engine("60", "BMW");
        Car bmwCar = new Car();
        bmwCar.setProducer ( "BMW" );bmwCar.setAClass ( "C" );bmwCar.setWeight ( 5000 );bmwCar.setDriver ( bmwDriver );bmwCar.setEngine ( bmwEngine );
        bmwCar.on();bmwCar.offReD ();bmwCar.turnR ();bmwCar.trunkClose ();
        System.out.println(bmwCar.toString());

        chooseCarOption ();
        Driver lorryDriver = new Driver("Петров В.В.", 45,  20);
        Engine lorryEngine = new Engine("30", "LorryEngine");
        Lorry lorry = new Lorry("Грузовик", "D", 8000, lorryDriver, lorryEngine, 70);lorry.on ();lorry.turnR ();lorry.onGreen ();lorry.trunkClose ();
        System.out.println(lorry.toString ());
        chooseCarOption ();
        Driver sportDriver = new Driver("Сидоров В.В.", 30,  15);
        Engine sportEngine = new Engine("80", "SportEngine");
        SportCar sportCar = new SportCar("SportCar", "C", 4000, sportDriver, sportEngine, 300);sportCar.off();sportCar.turnR ();sportCar.offReD ();sportCar.trunkClose ();
        System.out.println(sportCar.toString ());


    }

    private static void chooseCarOption() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number to choose option for car driving -> ");
        int num = in.nextInt();
        if (num >=3){
            System.out.println ("Incorrect input ");
            exit(0);
        }
        switch (num){
            case 1:
                typeOfDriveSport();
                break;
            case 2:
                typeofDriveUrban ();
                break;
            default:
                System.out.println ("Nothing was appropriately");
                break;
        }
    }

    private static void typeOfDriveSport() {
                System.out.println ("Your drive option is Sport");
        }
        public static void typeofDriveUrban(){
                System.out.println ("Your drive option is Urban");
        }
}