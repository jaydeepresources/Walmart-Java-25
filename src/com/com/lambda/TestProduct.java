package com.com.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestProduct {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(11, "Pen", 5.0f, 3.5f));
        products.add(new Product(9, "Pencil", 5.3f, 3.7f));
        products.add(new Product(13, "File", 3.9f, 2.5f));

        Collections.sort(products);
        System.out.println("Sorted by id:");
        System.out.println(products);

        Collections.sort(products, new ProductPriceSorter());
        System.out.println("Sorted by price:");
        System.out.println(products);

        Comparator<Product> ratingSorterLambda = (a, b) -> {
            if (a.getRating() < b.getRating())
                return 1;
            else if (a.getRating() > b.getRating())
                return -1;
            else
                return 0;
        };

        Collections.sort(products, ratingSorterLambda);
        System.out.println("Sorted by rating:");
        System.out.println(products);

    }
}