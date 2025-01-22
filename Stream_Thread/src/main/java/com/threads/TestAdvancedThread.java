package com.threads;

import com.threads.create.ThreadOne;
import com.threads.create.ThreadTwo;

import java.util.List;

public class TestAdvancedThread {
    public static void main(String[] args) {
        // Runnable --> Thread
        // MyThread extends Thread
        // MyRunnable --> Runnable
        // Lambda --> Runnable

        ThreadOne threadOne = new ThreadOne();
        threadOne.start();

        Thread threadTwo = new Thread(new ThreadTwo());
        threadTwo.start();

        Runnable runnableNoLambda = new Runnable() {
            @Override
            public void run() {
                System.out.println("Entering runnableNoLambda");
                for (int i = 0; i < 5; i++)
                    System.out.println("runnableNoLambda: " + i);
                System.out.println("Exiting runnableNoLambda");
            }
        };
        Thread threadThree = new Thread(runnableNoLambda);
        threadThree.start();

        Runnable runnableLambda = () -> {
            System.out.println("Entering runnableLambda");
            for (int i = 0; i < 5; i++)
                System.out.println("runnableLambda: " + i);
            System.out.println("Exiting runnableLambda");
        };
        Thread threadFour = new Thread(runnableLambda);
        threadFour.start();
    }
}