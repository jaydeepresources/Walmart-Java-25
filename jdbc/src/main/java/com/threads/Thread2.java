package com.threads;

public class Thread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Entering Thread: " + Thread.currentThread().getName());
        for (int i = 0; i < 15; i++)
            System.out.println(Thread.currentThread().getName() + ", " + i);
        System.out.println("Exiting Thread: " + Thread.currentThread().getName());
    }
}