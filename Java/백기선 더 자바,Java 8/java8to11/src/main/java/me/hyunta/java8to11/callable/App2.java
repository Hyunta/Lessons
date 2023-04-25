package me.hyunta.java8to11.callable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class App2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<String> hello = () -> {
            Thread.sleep(2000L);
            return "Hello";
        };

        Callable<String> woody = () -> {
            Thread.sleep(3000L);
            return "Woody";
        };

        Callable<String> hyunta = () -> {
            Thread.sleep(1000L);
            return "Hyunta";
        };

//        List<Future<String>> futures = executorService.invokeAll(Arrays.asList(hello, woody, hyunta));
//        for (Future<String> future : futures) {
//            System.out.println(future.get());
//        }

        String s = executorService.invokeAny(Arrays.asList(hello, woody, hyunta));
        System.out.println(s);
        executorService.shutdown();

    }
}
