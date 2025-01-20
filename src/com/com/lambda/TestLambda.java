package com.com.lambda;

public class TestLambda {
    public static void main(String[] args) {

        Foo longFooImpl = new Foo() {
            @Override
            public void foo(int bar) {
                System.out.println(bar);
            }
        };

        Foo fooImpl = (bar)-> System.out.println(bar) ;
        fooImpl.foo(10);
    }
}