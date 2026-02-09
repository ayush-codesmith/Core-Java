package com.Ayush.Multithreding.Executor_Framework;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceInterfaceDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);

    }
}
