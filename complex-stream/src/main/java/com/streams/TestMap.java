package com.streams;

import java.util.Arrays;
import java.util.List;

public class TestMap {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 33, 56, 765, 77, 45, 33, 29, 7);

        int sumOfSquares = numbers.stream()
                .map(number -> number * number)
                .reduce(0, Integer::sum);

//        TODO: Find square of each number
//        for (int i = 0; i < numbers.size(); i++)
//            numbers.set(i, numbers.get(i) * numbers.get(i));
//
//        System.out.println("Numbers after squaring using a for loop");
//        System.out.println(numbers);

//        TODO: Find square of each number using Function object
//        Stream<Integer> seqNumberStream = numbers.stream();
//        Function<Integer, Integer> function = new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer integer) {
//                return integer * integer;
//            }
//        };
//        Stream<Integer> seqNumberStreamSquared = seqNumberStream.map(function);
//        numbers = seqNumberStreamSquared.toList();
//        System.out.println("Numbers after squaring using a Function Object");
//        System.out.println(numbers);

//        TODO: Find square of each number using Lambda Expression
//        Stream<Integer> seqNumberStream = numbers.stream();
//        Function<Integer, Integer> functionLambda = (number) -> number * number;
//        Stream<Integer> seqNumberStreamSquared = seqNumberStream.map(functionLambda);
//        numbers = seqNumberStreamSquared.toList();

//        TODO: Replace lengthy code by chaining function calls
//        numbers = numbers.stream().map((number) -> number * number).toList();
//        System.out.println("Numbers after squaring using a Lambda");
//        System.out.println(numbers);
    }
}