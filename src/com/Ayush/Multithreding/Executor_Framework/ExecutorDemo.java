package com.Ayush.Multithreding.Executor_Framework;

import java.util.concurrent.Executor;

public class ExecutorDemo {
    public static void main(String[] args) {

        Executor executor = command -> {
            new Thread(command).start();
        };
        executor.execute(()-> System.out.println("Running...."));
        executor.execute(()-> System.out.println("Running...."));
        executor.execute(()-> System.out.println("Running...."));


    }
}
