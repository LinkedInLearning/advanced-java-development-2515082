package _05_04.end;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        Runnable runnable = new RunnableExample();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new RunnableExample());
        executorService.submit(() -> System.out.println("Hello from a runnable running in an ExecutorService"));

        executorService.shutdown();
    }

}
