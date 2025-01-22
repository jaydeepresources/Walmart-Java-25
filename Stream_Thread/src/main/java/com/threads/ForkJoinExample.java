package com.threads;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinExample {

    // A RecursiveTask to calculate the sum of an array
    static class SumTask extends RecursiveTask<Long> {
        private static final int THRESHOLD = 10; // Threshold for splitting
        private final int[] array;
        private final int start;
        private final int end;

        public SumTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Long compute() {
            // If the task is small enough, compute directly
            if (end - start <= THRESHOLD) {
                long sum = 0;
                for (int i = start; i < end; i++) {
                    sum += array[i];
                }
                return sum;
            } else {
                // Split the task into two subtasks
                int mid = (start + end) / 2;
                SumTask leftTask = new SumTask(array, start, mid);
                SumTask rightTask = new SumTask(array, mid, end);

                // Fork the subtasks
                leftTask.fork();
                rightTask.fork();

                // Join the results of subtasks
                long leftResult = leftTask.join();
                long rightResult = rightTask.join();

                // Combine the results
                return leftResult + rightResult;
            }
        }
    }

    public static void main(String[] args) {
        // Create an array to sum
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // Fill the array with numbers 1 to 100
        }

        // Create a ForkJoinPool
        ForkJoinPool pool = new ForkJoinPool();

        // Create the main task
        SumTask mainTask = new SumTask(array, 0, array.length);

        // Execute the task
        long result = pool.invoke(mainTask);

        // Print the result
        System.out.println("Sum of array: " + result);
    }
}
