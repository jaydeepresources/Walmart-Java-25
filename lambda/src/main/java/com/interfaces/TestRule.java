package com.interfaces;

public class TestRule {
    public static void main(String[] args) {
//        Old School and traditional route.
        Rule rule1 = new Follower();
        rule1.rule();

//        Modern and short route.
        Rule rule2 = new Rule() {
            public void rule() {
                System.out.println("Some Class implements Rule.");
            }
        };
        rule2.rule();

//        Lambda is a super short route.
        Rule rule3 = () -> System.out.println("Lambda implements Rule.");

//        Param Lambda
        ParamRule paramRule1 = (a, b) -> a + b;
        ParamRule paramRule2 = (a, b) -> {
            return a + b;
        };
    }
}