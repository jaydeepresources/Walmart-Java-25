package com.com.lambda;

import java.util.function.Predicate;

public class TestChecker {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        boolean argument = x > y;
        Checker checker = (arg) -> argument;

        System.out.println(checker.check(argument));

        Predicate<Product> productPricePredicate = (product) -> product.getPrice() > 100f;

    }
}
