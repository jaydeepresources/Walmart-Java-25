package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MatchTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,32,44,3,567,77,87,13,49,80);
//        Predicate<Integer> predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer < 100;
//            }
//        };

//        All match:- all numbers should match/satisfy this condition
        boolean result1 = numbers.stream().allMatch((number) -> number < 100);
        System.out.println("All Match: " + result1);

//        All match:- at least one number should match/satisfy this condition
        boolean result2 = numbers.stream().anyMatch((number) -> number < 100);
        System.out.println("Any Match: " + result2);
    }
}
