package com.jdbc;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    @Getter
    private static Connection connection;
    static {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Driver Loaded");
        try {
            connection = DriverManager.getConnection("jdbc:h2:file:/Users/administrator/Desktop/notes/codes/h2-security/h2","sa","");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Connection Established");
    }

}
