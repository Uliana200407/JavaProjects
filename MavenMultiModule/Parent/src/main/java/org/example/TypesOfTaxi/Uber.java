package org.example.TypesOfTaxi;

public class Uber extends Taxi {
    int pricePerKm = 19;
    int distance;

    public void CalculatePrice(){
        System.out.println (pricePerKm*distance + "$ price for your trip - by firm Uber");
    }
    public Uber(String type, int distance) {
        super ( type );
        this.distance = distance;
    }
}
