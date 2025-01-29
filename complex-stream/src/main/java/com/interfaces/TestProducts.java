package com.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestProducts {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(123, "Pen", 12.5));
        products.add(new Product(453, "Eraser", 1.5));
        products.add(new Product(341, "File", 16.8));

//        Collections.sort(products);
//        System.out.println("Print the sorted (id) Products");
//        System.out.println(products);

//        Collections.sort(products, new ProductPriceSorter());
//        System.out.println("Print the sorted (price) Products");
//        System.out.println(products);

//        Comparator<Product> comparator = new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                if (o1.getPrice() < o2.getPrice())
//                    return -1;
//                else if (o1.getPrice() > o2.getPrice())
//                    return 1;
//                else
//                    return 0;
//            }
//        };
//
//        Collections.sort(products, comparator);
//        System.out.println("Print the sorted (price) Products using A.C.");
//        System.out.println(products);

        Comparator<Product> comparatorLambda = (o1, o2) -> o1.getPrice().compareTo(o2.getPrice());

//        Collections.sort(products, comparatorLambda);
//        System.out.println("Print the sorted (price) Products using Lambda");
//        System.out.println(products);

        products.forEach(product -> System.out.println(product));

    }
}