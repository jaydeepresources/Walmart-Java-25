package com.jdbc;

import java.sql.*;

public class TestJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        TODO 1:- Load the Driver class
        Class.forName("org.h2.Driver");
        System.out.println("Driver is loaded.");

//        TODO 2:- Establish the Connection
        Connection connection = DriverManager.getConnection("jdbc:h2:file:/Users/administrator/Desktop/notes/codes/h2-security/h2","sa", "");
        System.out.println("Connection Established.");

//        Insert Query
//        String query = "insert into TEST.PRODUCTS(PRODUCT_NAME, PRODUCT_PRICE, PRODUCT_RATING) values (?, ?, ?)";
//        PreparedStatement preparedStatement = connection.prepareStatement(query);
//        preparedStatement.setString(1, "File");
//        preparedStatement.setDouble(2, 8.7);
//        preparedStatement.setDouble(3, 3.7);
//
//        int res = preparedStatement.executeUpdate();
//        System.out.println("Rows inserted: " + res);

//        Select Query
//        String query = "select * from test.products";
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery(query);
//
//        System.out.println("Printing Products Table");
//        while (resultSet.next()) {
//            System.out.println("---------------------------------------");
//            System.out.println("Id: " + resultSet.getLong(1));
//            System.out.println("Name: " + resultSet.getString(2));
//            System.out.println("Price: " + resultSet.getDouble(3));
//            System.out.println("Rating: " + resultSet.getDouble(4));
//        }


        connection.close();
    }


}
