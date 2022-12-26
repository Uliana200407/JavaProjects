import java.util.List;

public class ProcessCustomers implements java.lang.Runnable {
    List < Customer > customers;
    List < Sale > sales;

    ProcessCustomers(List < Customer > customers, List < Sale > sales) {
        this.customers = customers;
        this.sales = sales;
    }


    public void run() {
        for (int step = 0; step < 120; step++) {  // to work 10 minutes (120 * 5 sleep == 600 seconds == 10 minutes)
            // sleep Thread
            try {
                Thread.sleep ( 5000 );  // 5000 = 5 seconds sleep
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }

            for (Customer cust : customers) {  // process each customer
                for (Sale cust_sale : cust.target) {  // process each customer target
                    for (Sale sale : sales) {  // process each sale
                        if (cust_sale.name.equals ( sale.name )) {
                            if (cust_sale.price >= sale.price && cust_sale.amount <= sale.amount) {
                                System.out.println ( Main.GetDateTimeNow () + " Спроба купівлі акції " + sale.name +
                                        " для " + cust.name + " успішна. Куплено " + cust_sale.amount + " акцій." );
                                sale.amount -= cust_sale.amount;
                            }
                            break;
                        }
                    }
                }
            }
        }
    }
}
