package com.com;

public class InterfaceMain {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();

        Printable printable = new Printable() {
            public void print() {
                System.out.println("Short cut to printing.");
            }
        };

        printable.print();

        Printable lambdaVar = () -> {
            System.out.println("Lambda short cut to printing.");
        };
        lambdaVar.print();

    }
}