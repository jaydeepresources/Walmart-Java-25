package com.streams;

public class TestReduce {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 4, 33, 56, 765, 77, 45, 33, 29, 7);

//        TODO: Find the sum of numbers only using reduce and BinaryOperator
//        Stream<Integer> numberStream = numbers.stream();
//        BinaryOperator<Integer> sumOperator = new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer num1, Integer num2) {
//                return num1 + num2;
//            }
//        };
//        Integer sum = numberStream.reduce(0, sumOperator);
//        System.out.println("Sum using BinaryOperator:" + sum);

//        TODO: Find the sum of numbers only using reduce and lambda
//        Stream<Integer> numberStream = numbers.stream();
//        BinaryOperator<Integer> sumOperator = (num1, num2)-> num1 + num2 ;
//        Integer sum = numberStream.reduce(0, sumOperator);
//        System.out.println("Sum using BinaryOperator Lambda:" + sum);

//        TODO: Replace lengthy code by chaining function calls
//        Integer sum = numbers.stream().reduce(0, (num1, num2) -> num1 + num2);
//        System.out.println("Sum using BinaryOperator Lambda:" + sum);

//        Random random = new Random();
//        List<Long> numbers = new ArrayList<>();
//
//        System.out.println("Adding lot of long numbers");
//        for (long i=0;i<10000000;i++)
//            numbers.add(random.nextLong(0L, 1000000000L));
//        System.out.println("Added a lot of long numbers");
//
//        Long sum1 = numbers.stream().reduce(0L, (num1, num2) -> num1 + num2);
//        System.out.println("Sum1: " + sum1);
//
//        Long sum2 = numbers.parallelStream().reduce(0L, (num1, num2) -> num1 + num2);
//        System.out.println("Sum2: " + sum2);


    }
}
