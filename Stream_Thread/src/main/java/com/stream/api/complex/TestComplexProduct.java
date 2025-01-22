package com.stream.api.complex;

import java.util.List;

public class TestComplexProduct {
    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product(11,"Pen",45f),
                new Product(41,"Pencil",24f),
                new Product(21,"File",15f)
        );

//        TODO: Filter products having price less than 25
//        products = products.stream().filter(product -> product.getPrice() < 25f).toList();
//        System.out.println(products);

//        TODO: Map products by slashing the price by 5%
//        products = products.stream().map(product -> {
//            product.setPrice(product.getPrice() - (product.getPrice() * 0.05f));
//            return product;
//        }).toList();
//        System.out.println(products);

//        TODO: Find the average product price
        List<Float> prices = products.stream().map(product -> product.getPrice()).toList();
        int count = prices.size();
        float avg = (prices.stream().reduce(0F, Float::sum))/count;
        System.out.println(avg);

//        maptoDouble function: map any object to a float/double value
        float mapAvg = (float)
                products
                .stream()
                .mapToDouble(Product::getPrice)
                .average().orElse(0);
        System.out.println(mapAvg);

        List<String> names = List.of("John", "Janey", "Raj");
        int namesAvg = (int) names.stream().mapToInt(String::length).average().orElse(0);


    }
}