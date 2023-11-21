package ru.ubrr.pr.sql;

import java.sql.*;

public class JoinExample {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/test";
        String username = "test";
        String password = "test";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String innerJoinQuery = "SELECT p.title, c.text " +
                    "FROM posts p " +
                    "INNER JOIN comments c ON p.id = c.post_id";

            try (PreparedStatement statement = connection.prepareStatement(innerJoinQuery);
                 ResultSet resultSet = statement.executeQuery()) {
                System.out.println("Inner join");
                while (resultSet.next()) {
                    String postTitle = resultSet.getString("title");
                    String commentText = resultSet.getString("text");
                    System.out.println("Post Title: " + postTitle + ", Comment Text: " + commentText);
                }
            }

            String leftJoinQuery = "SELECT p.title, c.text " +
                    "FROM posts p " +
                    "LEFT JOIN comments c ON p.id = c.post_id";

            try (PreparedStatement statement = connection.prepareStatement(leftJoinQuery);
                 ResultSet resultSet = statement.executeQuery()) {
                System.out.println("Left join");
                while (resultSet.next()) {
                    String postTitle = resultSet.getString("title");
                    String commentText = resultSet.getString("text");
                    System.out.println("Post Title: " + postTitle + ", Comment Text: " + commentText);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}