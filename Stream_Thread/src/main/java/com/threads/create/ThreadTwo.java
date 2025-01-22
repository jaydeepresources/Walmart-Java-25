package com.threads.create;

public class ThreadTwo implements Runnable {
    @Override
    public void run() {
        System.out.println("Entering ThreadTwo");
        for (int i = 0; i < 5; i++)
            System.out.println("ThreadTwo: " + i);
        System.out.println("Exiting ThreadTwo");
    }
}
