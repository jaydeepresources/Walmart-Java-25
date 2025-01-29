package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.LongStream;

public class TestProduct {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(123, "Pen", 12.5));
        products.add(new Product(673, "Pencil", 2.5));
        products.add(new Product(876, "Eraser", 1.5));
        products.add(new Product(129, "Binder", 19.5));
        products.add(new Product(432, "File", 22.5));

//        TODO: Discount each product by 5%
//        products = products.stream().map(product -> {
//            product.setPrice(product.getPrice() - (product.getPrice() * 0.05));
//            return product;
//        }).toList();
//        products.forEach(System.out::println);

//        TODO: Filter products having price less than 15
//        products = products.stream().filter(product -> product.getPrice() < 15.0).toList();
//        products.forEach(System.out::println);

//        TODO: Find average price of the products
//          1. Extract price only from products
//          2. Reduce the price

//        double sum = products.stream()
//                .map(Product::getPrice)
//                .reduce(0.0, Double::sum);
//        double count = products.size();
//        double avg = sum / count;
//        System.out.println("Average price: " + avg);

//        TODO: Find average price of the products using mapToDouble

//        ToDoubleFunction<Product> toDoubleFunction = new ToDoubleFunction<Product>() {
//            @Override
//            public double applyAsDouble(Product value) {
//                return value.getPrice();
//            }
//        };
//        double avg = products.stream()
//                .mapToDouble((Product::getPrice))
//                .average()
//                .orElse(0.0);
//        System.out.println("Average price: " + avg);


    }
}
