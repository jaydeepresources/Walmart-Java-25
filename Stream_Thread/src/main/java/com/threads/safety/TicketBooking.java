package com.threads.safety;

public class TicketBooking {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        Runnable booking = () -> {
            ticket.bookTicket();
        };

        Thread[] threads = new Thread[12];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(booking);
        }

        for (Thread thread: threads)
            thread.start();

    }
}
