package com.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) {
        // Create an ExecutorService with a fixed thread pool of 2 threads
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Create tasks using the Callable interface
        Callable<String> task1 = () -> {
            Thread.sleep(1000); // Simulate some work
            return "Result from Task 1";
        };

        Callable<String> task2 = () -> {
            Thread.sleep(500); // Simulate some work
            return "Result from Task 2";
        };

        // Submit tasks to the executor and get Future objects
        Future<String> future1 = executorService.submit(task1);
        Future<String> future2 = executorService.submit(task2);

        try {
            // Retrieve the results from the Future objects
            String result1 = future1.get(); // Blocks until task1 is complete
            String result2 = future2.get(); // Blocks until task2 is complete

            // Print the results
            System.out.println("Result of Task 1: " + result1);
            System.out.println("Result of Task 2: " + result2);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // Shut down the executor
            executorService.shutdown();
        }
    }
}
