package com.chat.server;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthenticationService {
    public User findUserByEmailAndPassword(String email, String password){
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM ChatBase,AccountBase WHERE email = ? AND password = ?"
            );
            statement.setString(1, email);
            statement.setString(2, password);
            ResultSet rs = statement.executeQuery();
           if (rs.next()){
               return new User(
                       rs.getInt("id"),
                       rs.getString("nickname"),
                       rs.getString("email"),
                       rs.getString("password")
               );
           }
           return null;
        } catch (SQLException throwables) {
            throw new RuntimeException("SWW during user fetch", throwables);
        }
    }
}
