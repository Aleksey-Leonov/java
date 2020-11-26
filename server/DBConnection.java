package com.chat.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private DBConnection() {
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:8889/ChatBase", "root", "root");
        } catch (SQLException throwables) {
            throw new RuntimeException("SWW during gating connection", throwables);
        }
    }
    public static void close(Connection connection){
        try {
            connection.close();
        } catch (SQLException throwables) {
            throw new RuntimeException("SWW durring close connection");
        }
    }
}

