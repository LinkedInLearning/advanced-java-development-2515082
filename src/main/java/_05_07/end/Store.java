package _05_07.end;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Store {

    // Make this method a synchronized method
    static synchronized void purchase(StockChecker stockChecker, int amount) {
        int stock = stockChecker.getStock();
        if(stock - amount < 0) {
            System.out.println("Not enough stock");
        } else {
            System.out.println("Item is in stock");
            stockChecker.updateStock(amount);
            System.out.println(amount + " items purchased");
        }
        System.out.println("Current stock: " + stockChecker.getStock());
    }

    public static void main(String[] args) {
        // Create a new StockChecker object
        StockChecker stockChecker = new StockChecker();

        // Create an ExecutorService with a fixed thread pool of 4 threads
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Submit 4 tasks to the executor service.
        // In each task you should call the purchase method and pass in 20,
        // to represent a customer purchasing 20 items.
        executorService.submit(() -> purchase(stockChecker, 20));
        executorService.submit(() -> purchase(stockChecker, 20));
        executorService.submit(() -> purchase(stockChecker, 20));
        executorService.submit(() -> purchase(stockChecker, 20));

        // Shut down the executor service.
        executorService.shutdown();
    }

}
