package com.threads;

public class TestTicketBooking {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Runnable runnable = ticket::bookTicket;
        Thread[] threads = new Thread[15];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(runnable);
        }

        for (Thread thread: threads)
            thread.start();
    }
}
