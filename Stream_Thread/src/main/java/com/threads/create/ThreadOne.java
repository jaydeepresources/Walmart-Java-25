package com.threads.create;

public class ThreadOne extends Thread {
    @Override
    public void run() {
        System.out.println("Entering ThreadOne");
        for (int i = 0; i < 5; i++)
            System.out.println("ThreadOne: " + i);
        System.out.println("Exiting ThreadOne");
    }
}