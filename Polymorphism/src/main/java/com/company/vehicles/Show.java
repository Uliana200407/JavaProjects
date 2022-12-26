package com.company.vehicles;
import com.company.details.Engine;
import com.company.professions.Driver;
public class Show {
    private static Driver mazdaDriver;
    private static Engine mazdaEngine;
    public static void main(String[]args){
        Driver bmwDriver = new Driver("Andreyev Arsenii Andriyovich", " man", 22, 0334543);
        Engine bmwEngine = new Engine(77, "Mazda");
        Car car = new Car("Mazda", "A", 6600, mazdaDriver, mazdaEngine);
        Driver lorryDriver = new Driver("Sedder John Humalious", "man", 55, 04456);
        Engine lorryEngine = new Engine(55, "LorryEngine");
        LorryCar lorry = new LorryCar("Lorry", "D", 10000, lorryDriver, lorryEngine);

        Driver sportDriver = new Driver("Miller Kate Johnaton", "woman", 34, 380873249);
        Engine sportEngine = new Engine(99, "Sporttrack");
        SportCar sportCar = new SportCar("SportCar", "C", 4400, sportDriver, sportEngine);

        System.out.println(car);
        System.out.println(lorry);
        System.out.println(sportCar);
    }
}

