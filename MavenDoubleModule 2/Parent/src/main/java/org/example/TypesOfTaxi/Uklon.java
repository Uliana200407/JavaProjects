package org.example.TypesOfTaxi;

public class Uklon extends Taxi{
    int pricePerKm = 25;
    int distance;
    public void CalculatePrice(){
        System.out.println (pricePerKm*distance + "$ price for your trip - by firm Uklon");
    }
    public Uklon(String type, int distance) {
        super ( type );
        this.distance = distance;

    }
}
