import java.lang.Runnable;
import java.util.*;
import java.lang.*;
import java.text.SimpleDateFormat;
import java.util.List;

class Sale {  // class for Sales
    String name;
    int amount, price;
    public Sale(String name, int amount, int price){
        this.name = name;
        this.amount = amount;
        this.price = price;
    }
}

class Customer {  // class for Customers
    String name;
    List<Sale> target;  // list of Sales

    public Customer(String name, List<Sale> target){
        this.name = name;
        this.target = target;
    }
}


public class Main {
    public static String GetDateTimeNow() {  // function for getting and formatting now date-time
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return formatter.format(date);
    }


    public static void main(String[] args) {
        // standard Sales' data
        List<Sale> sales = List.of(
                new Sale("AAPL", 100, 141),
                new Sale("COKE", 1000, 387),
                new Sale("IBM", 200, 137)
        );

        // standard Customers' data
        List<Customer> customers = List.of(
                new Customer("Alice", List.of(
                        new Sale("AAPL", 10, 100),
                        new Sale("COKE", 20, 390)
                )),
                new Customer("Bob", List.of(
                        new Sale("AAPL", 10, 140),
                        new Sale("IBM", 20, 135)
                )),
                new Customer("Charlie", List.of(
                        new Sale("COKE", 300, 370)
                ))
        );

        System.out.println("Акції:");
        for (Sale sale: sales) {
            System.out.println("\tName: " + sale.name + ", amount: " + sale.amount + ", price: " + sale.price);
        }

        System.out.println("Покупці:");
        for (Customer cust: customers) {
            System.out.println("\tName: " + cust.name + ", target:");
            for (Sale sale: cust.target) {
                System.out.println("\t\tName: " + sale.name + ", amount: " + sale.amount + ", price: " + sale.price);
            }
        }

        System.out.println("\n" + GetDateTimeNow() + " Початок виконання");

//         running Thread 1 to Process Sales
        new Thread( new ProcessSales(sales).toString () ).start();

        // running Thread 2 to Process Customers
        new Thread(  new ProcessCustomers(customers, sales) ).start();
    }
}

