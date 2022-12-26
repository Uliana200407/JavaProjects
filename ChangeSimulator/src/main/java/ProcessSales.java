
import java.util.List;
import java.lang.*;


    public class ProcessSales implements Runnable {
        List<Sale> sales;
        ProcessSales(List<Sale> sales) {
            this.sales = sales;
        }


        public void run() {
            for (int step = 0; step < 20; step ++) {  // to work 10 minutes (20 * 30 sleep == 600 seconds == 10 minutes)
                // sleep Thread
                try {
                    Thread.sleep(30000);  // 30000 = 30 seconds sleep
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                for (Sale sale : sales) {  // process each sale
                    // change sale's price in range +-3%
                    sale.price += (int) ((Math.random() * (sale.price * 0.03 + sale.price * 0.03)) - sale.price * 0.03);
                    System.out.println(Main.GetDateTimeNow() + " Ціна акцій компанії " + sale.name +
                            " змінилась. Поточна вартість: " + sale.price);
                }
            }

            System.out.println(Main.GetDateTimeNow() + " Кінець виконання");
        }
    }

