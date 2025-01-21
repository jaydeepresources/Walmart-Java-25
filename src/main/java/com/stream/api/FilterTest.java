package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,32,44,3,567,77,87,13,49,80);

//        TODO: Accept only even numbers
//        TODO: filter() Without Lambda

//        Stream<Integer> numbersStream = numbers.stream();
//        Predicate<Integer> predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer % 2 == 0;
//            }
//        };
//        Stream<Integer> numbersStreamEven = numbersStream.filter(predicate);
//        List<Integer> evenNumbers = numbersStreamEven.toList();
//        System.out.println("Even numbers using filter() without Lambda:");
//        System.out.println(evenNumbers);

//        TODO: Accept only even numbers
//        TODO: filter() With Lambda

        List<Integer> evenNumbersLambda =
                        numbers
                        .stream()
                        .filter((number)-> number% 2 == 0)
                        .toList();
        System.out.println("Even numbers using filter() with Lambda:");
        System.out.println(evenNumbersLambda);
    }
}















