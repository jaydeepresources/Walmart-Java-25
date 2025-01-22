package com.stream.api.com.supplier;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestSupplierConsumer {
    public static void main(String[] args) {
        Random random = new Random();
//        TODO:Supplier without lambda
//        Supplier<Double> supplier = new Supplier<Double>() {
//            @Override
//            public Double get() {
//                return random.nextDouble(100.0);
//            }
//        };

//        TODO:Supplier with lambda
        Supplier<Double> supplier = () -> random.nextDouble(100.0);

//        TODO:Consumer without lambda
//        Consumer<Double> consumer = new Consumer<Double>() {
//            @Override
//            public void accept(Double number) {
//                System.out.println(number);
//            }
//        };

//        TODO:Consumer with lambda and method reference
        Consumer<Double> consumer = System.out::println;

        for (int i = 0; i < 5; i++)
            consumer.accept(supplier.get());
    }
}