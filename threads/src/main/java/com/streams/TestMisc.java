package com.streams;

import java.util.Arrays;
import java.util.List;

public class TestMisc {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 33, 56, 765, 77, 45, 33, 29, 7);

//        TODO: Find if all numbers are even
        boolean result = numbers.stream().allMatch(number -> number % 2 == 0);
        System.out.println("All numbers are even : " + result);

//        TODO: Find if any number is even
        result = numbers.stream().anyMatch(number -> number % 2 == 0);
        System.out.println("Is any number even : " + result);

    }
}
