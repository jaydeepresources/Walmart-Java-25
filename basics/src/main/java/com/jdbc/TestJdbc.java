package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class TestJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        System.out.println("Driver Loaded");
        Connection connection = DriverManager.getConnection("jdbc:h2:file:/Users/administrator/Desktop/notes/codes/h2-security/h2","sa","");
        System.out.println("Connection Established");

        Scanner scanner = new Scanner(System.in);

//        TODO: Insert Product
//        System.out.println("Enter product name, price and the rating.");
//        String productName = scanner.nextLine();
//        float productPrice = Float.parseFloat(scanner.nextLine());
//        float productRating = Float.parseFloat(scanner.nextLine());
//
//        String insertQuery = "insert into test.products(PRODUCT_NAME, PRODUCT_PRICE, PRODUCT_RATING) values(?, ?, ?)";
//        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
//        preparedStatement.setString(1, productName);
//        preparedStatement.setFloat(2, productPrice);
//        preparedStatement.setFloat(3, productRating);
//
//        int res = preparedStatement.executeUpdate();
//        System.out.println("Rows Inserted: " + res);

//        TODO: View Products
//        String selectQuery = "select * from test.products";
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery(selectQuery);
//        System.out.println("Printing Products Table");
//        while(resultSet.next()){
//            System.out.println("=====================ROW=======================");
//            System.out.println("Id: " + resultSet.getLong(1));
//            System.out.println("Name: " + resultSet.getString(2));
//            System.out.println("Price: " + resultSet.getFloat(3));
//            System.out.println("Rating: " + resultSet.getFloat(4));
//            System.out.println("===============================================");
//        }
        connection.close();
    }
}
