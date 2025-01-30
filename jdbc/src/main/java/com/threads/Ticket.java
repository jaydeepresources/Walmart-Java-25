package com.threads;

public class Ticket {
    private int ticketCount = 10;

    public synchronized void bookTicket() {
        System.out.println("Start the booking process.");
        if (ticketCount > 0) {
            System.out.println("Ticket Booked");
            System.out.println("Tickets Remaining: " + --ticketCount);
        }
        else
            System.out.println("Tickets Sold Out.");

        System.out.println("Stop the booking process.");
    }
}