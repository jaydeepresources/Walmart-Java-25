package com.jdbc;

import java.util.Scanner;

public class TestDAO {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProductDAOImpl impl = new ProductDAOImpl();

//        TODO: Insert Product
        System.out.println("Enter product name, price and the rating.");
        String productName = scanner.nextLine();
        float productPrice = Float.parseFloat(scanner.nextLine());
        float productRating = Float.parseFloat(scanner.nextLine());
        int res = impl.insert(new Product(0L, productName, productPrice, productRating));
        System.out.println("Rows Inserted: " + res);
    }
}
