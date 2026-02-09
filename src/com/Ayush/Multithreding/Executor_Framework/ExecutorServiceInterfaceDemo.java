package com.Ayush.Multithreding.Executor_Framework;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceInterfaceDemo {
    private static Object TimeUnit;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i=0;i<10;i++){


          Future<?> future = service.submit(()->{
                System.out.println("Running...");
            });
            System.out.println(future.state());

        }

        service.shutdown();

        System.out.println(System.currentTimeMillis()-startTime);

    }
}
