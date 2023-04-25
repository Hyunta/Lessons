package me.hyunta.java8to11.callable;

import java.util.concurrent.*;

public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> hello = () -> {
            Thread.sleep(2000L);
            return "Hello";
        };

        Future<String> helloFuture = executorService.submit(hello);
        System.out.println(helloFuture.isDone());
        System.out.println("Started!!");

        helloFuture.cancel(false);
//        helloFuture.get();

        System.out.println("End!!");
        System.out.println(helloFuture.isDone());
        executorService.shutdown();
    }
}
