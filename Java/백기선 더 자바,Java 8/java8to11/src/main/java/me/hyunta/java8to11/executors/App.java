package me.hyunta.java8to11.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(getRunnable("Hello"), 1, 2, TimeUnit.SECONDS);


//        executorService.submit(getRunnable("Hello"));
//        executorService.submit(getRunnable("java"));
//        executorService.submit(getRunnable("white"));
//        executorService.submit(getRunnable("ship"));
//        executorService.submit(getRunnable("eight"));

//        executorService.shutdown();
    }

    private static Runnable getRunnable(String message) {
        return () -> {
            System.out.println(message + Thread.currentThread().getName());
        };
    }
}
