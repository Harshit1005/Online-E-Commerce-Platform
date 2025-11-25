package com.ecommerce.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/ecommerce_db";
    private static final String USER = "root";
    private static final String PASSWORD = "harshit@9569"; // change this

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");  // LOAD DRIVER
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
