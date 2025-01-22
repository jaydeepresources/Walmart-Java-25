package com.threads.safety;

public class Ticket {
    private int totalTickets = 10;

    public int getTotalTickets() {
        return totalTickets;
    }

    public void setTotalTickets(int totalTickets) {
        this.totalTickets = totalTickets;
    }

    public synchronized void bookTicket(){
        System.out.println("Starting Ticket Booking for " + Thread.currentThread().getName());
        if(totalTickets > 0)
            System.out.println("Tickets Remaining: " + --totalTickets);
        else
            System.out.println("Tickets Sold Out.");
        System.out.println("Stopping Ticket Booking for " + Thread.currentThread().getName());
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "totalTickets=" + totalTickets +
                '}';
    }
}
