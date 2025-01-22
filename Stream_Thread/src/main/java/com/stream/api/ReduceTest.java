package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReduceTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,32,44,3,567,77,87,13,49,80);

//        TODO: Find the sum of all numbers
//        TODO: reduce() without lambda

//        Stream<Integer> stream = numbers.stream();
//        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer integer1, Integer integer2) {
//                return integer1 + integer2;
//            }
//        };
//        Integer sum = stream.reduce(0 ,binaryOperator);
//        System.out.println("Sum of numbers using reduce() without lambda: " + sum);

//        TODO: Find the sum of all numbers
//        TODO: reduce() without lambda
//                                            reduce(0, (a, b) -> a + b);
//        Integer lamdaSum = numbers.stream().reduce(0, Integer::sum);
//        System.out.println("Sum of numbers using reduce() with lambda: " + lamdaSum);

    }
}