package com.streams;

import java.util.Arrays;
import java.util.List;

public class TestMethodReferences {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("APPLE", "BANANA", "ORANGE", "KIWI");

//    TODO: Map each fruit into a lower case
        fruits.stream()
                .map(String::toLowerCase)
                .forEach(System.out::println);

//    TODO: Map each fruit into a lower case using for loop

        for (int i = 0; i < fruits.size(); i++) {
            fruits.set(i, fruits.get(i).toLowerCase());
            System.out.println(fruits.get(i));
        }
    }

}
