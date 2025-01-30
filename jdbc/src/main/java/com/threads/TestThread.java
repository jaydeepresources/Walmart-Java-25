package com.threads;

public class TestThread {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();

        Thread thread2 = new Thread(new Thread2());
        thread2.start();

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Entering Thread: " + Thread.currentThread().getName());
                for (int i = 0; i < 15; i++)
                    System.out.println(Thread.currentThread().getName() + ", " + i);
                System.out.println("Exiting Thread: " + Thread.currentThread().getName());
            }
        };

        Thread thread3 = new Thread(runnable1);
        thread3.start();

        Runnable runnable2 = () -> {
            System.out.println("Entering Thread: " + Thread.currentThread().getName());
            for (int i = 0; i < 15; i++)
                System.out.println(Thread.currentThread().getName() + ", " + i);
            System.out.println("Exiting Thread: " + Thread.currentThread().getName());
        };

        Thread thread4 = new Thread(runnable2);
        thread4.start();
    }
}
