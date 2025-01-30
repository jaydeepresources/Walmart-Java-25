package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 33, 56, 765, 77, 45, 33, 29, 7);

//        TODO: Filter even numbers only using Predicate
//        Stream<Integer> numberStream = numbers.stream();
//        Predicate<Integer> predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer % 2 == 0;
//            }
//        };
//        Stream<Integer> numberStreamEven = numberStream.filter(predicate);
//        numbers = numberStreamEven.toList();
//        System.out.println("Even numbers using Predicate");
//        System.out.println(numbers);

//        TODO: Filter even numbers only using Lambda
//        Stream<Integer> numberStream = numbers.stream();
//        Predicate<Integer> predicate = (number)-> number % 2 == 0;
//        Stream<Integer> numberStreamEvenPredicate = numberStream.filter(predicate);
//        numbers = numberStreamEvenPredicate.toList();
//        System.out.println("Even numbers using Predicate");
//        System.out.println(numbers);

//        TODO: Replace lengthy code by chaining function calls
//        numbers = numbers.stream().filter(number-> number % 2 == 0).toList();
//        System.out.println("Even numbers using Predicate");
//        System.out.println(numbers);

    }
}
