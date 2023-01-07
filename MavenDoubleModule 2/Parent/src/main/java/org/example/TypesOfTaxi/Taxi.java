package org.example.TypesOfTaxi;

    public class Taxi extends Thread {
        String type;
        public Taxi(String type){
           this.type = type;
        }

        public void run() {
            try {
                Thread.sleep(700);
                System.out.println ("\n");
                // Display status of Current Thread is alive
                System.out.println("Is taxi Uber is ready to be ordered : " + Thread.currentThread().isAlive());
                System.out.println("Is taxi Uklon is ready to be ordered : " + Thread.currentThread().isAlive());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        public void CalculatePrice() {
        }
    }