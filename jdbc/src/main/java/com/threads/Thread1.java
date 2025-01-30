package com.threads;

public class Thread1 extends Thread {

    @Override
    public void run() {
        System.out.println("Entering Thread: " + getName());
        for (int i = 0; i < 15; i++)
            System.out.println(getName() + ", " + i);
        System.out.println("Exiting Thread: " + getName());
    }
}
