package com.streams;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestSupplierConsumer {
    public static void main(String[] args) {
//        TODO: Supplier and Consumer

        Random random = new Random();

        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return random.nextInt(100);
            }
        };

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

//        TODO: Lambdas for both Supplier and Consumer
        Supplier<Integer> supplierLambda = () -> random.nextInt(100);
        Consumer<Integer> consumerLambda = System.out::println;

        for (int i = 0; i < 10; i++) {
//            consumer.accept(supplier.get());
            consumerLambda.accept(supplierLambda.get());
        }
    }
}
