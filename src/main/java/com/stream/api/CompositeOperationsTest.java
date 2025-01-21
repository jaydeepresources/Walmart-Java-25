package com.stream.api;

import java.util.Arrays;
import java.util.List;

public class CompositeOperationsTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,32,44,3,567,77,87,13,49,80);
//        TODO: Square each number, filter the even numbers and find the sum
        Integer sum =
                        numbers.stream()
                        .map((number) -> number * number)
                        .filter((number)-> number % 2 == 0)
                        .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum);
    }
}