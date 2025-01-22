package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // Create an ExecutorService with a fixed thread pool of 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Create some tasks to execute
        Runnable task1 = () -> {
            System.out.println("Task 1: Executed by " + Thread.currentThread().getName());
        };

        Runnable task2 = () -> {
            System.out.println("Task 2: Executed by " + Thread.currentThread().getName());
        };

        Runnable task3 = () -> {
            System.out.println("Task 3: Executed by " + Thread.currentThread().getName());
        };

        Runnable task4 = () -> {
            System.out.println("Task 4: Executed by " + Thread.currentThread().getName());
        };

        // Submit tasks to the executor
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.submit(task4);

        // Shut down the executor
        executorService.shutdown();
    }
}
