package com.stream.api;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,32,44,3,567,77,87,13,49,80);

//        TODO: Non Stream
//        TODO: Find the square of each number

//        for(int i=0;i<numbers.size();i++)
//            numbers.set(i, numbers.get(i) *  numbers.get(i));
//        System.out.println("List of numbers after squaring with a for loop:");
//        System.out.println(numbers);

//        TODO: Stream and using forEach instead of a traditional for loop.
//        System.out.println("Sequential Stream");
//        Stream<Integer> stream = numbers.stream();

//        TODO: Method Reference
//        stream.forEach(System.out::println);

//        TODO: Parallel Stream and using forEach instead of a traditional for loop.
//        System.out.println("Parallel Stream");
//        Stream<Integer> parallelStream = numbers.parallelStream();
//        parallelStream.forEach(number-> System.out.println(number));

//        TODO: Find square of each number
//        TODO: Without Lambda Expression

//        Stream<Integer> numbersStream = numbers.stream();

//        Function<Integer, Integer> squarerFunction = new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer integer) {
//                return integer * integer;
//            }
//        };

//        Stream<Integer> squaredNumbersStream = numbersStream.map(squarerFunction);
//        List<Integer> squaredNumbers = squaredNumbersStream.toList();
//        System.out.println("Squared Numbers List using map():");
//        System.out.println(squaredNumbers);

//        TODO: With Lambda Expression
//        List<Integer> squaredNumbersLambda =
//                         numbers
//                        .stream()
//                        .map((number)-> number * number)
//                        .toList();
//        System.out.println("Squared Numbers List using map() using Lambda:");
//        System.out.println(squaredNumbersLambda);

    }
}















