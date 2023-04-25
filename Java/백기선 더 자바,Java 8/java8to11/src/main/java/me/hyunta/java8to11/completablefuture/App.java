package me.hyunta.java8to11.completablefuture;

import java.util.concurrent.*;

public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService executorService = Executors.newFixedThreadPool(4);
//        Future<String> future = executorService.submit(() -> "hello");
//
//        //TODO Future을 사용하게 되면 여러 Future를 사용할 수 없다.
//
//        future.get();

        /**
         * returnType이 없는 경우
         */
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
        });
        System.out.println(future.get());

        /**
         * returnType이 있는 경우
         */
        CompletableFuture<String> supplyAsync = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        }).thenApply((s) -> {
            System.out.println(Thread.currentThread().getName());
            return s.toUpperCase();
        });
        System.out.println(supplyAsync.get());

        /**
         * returnType이 없을때
         */
        CompletableFuture<Void> future1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        }).thenAccept((s) -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(s.toUpperCase());
        });
        future1.get();

        /**
         * Runnable 처리
         */

        CompletableFuture<Void> future2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        }).thenRun(() -> {
            System.out.println(Thread.currentThread().getName());
        });

        future2.get();

        /**
         * ForkJoinPool 말고 내가 지정한 쓰레드풀 지정
         */
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        CompletableFuture<Void> future3 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        }, executorService).thenRun(() -> {
            System.out.println(Thread.currentThread().getName());
        });

        future3.get();
        executorService.shutdown();
    }
}
