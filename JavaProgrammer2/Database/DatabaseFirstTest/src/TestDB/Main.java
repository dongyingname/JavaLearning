/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDB;

import java.nio.file.*;
import java.sql.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author yingd
 */
public class Main {

    public static void main(String[] args) throws IOException {

    }

    public static void runTest() throws IOException, SQLException {
        try (Connection conn = getConnection();
                Statement stat = conn.createStatement()) {
            stat.executeUpdate("CREATE TABLE Greetings (Message CHAR(20))");
            stat.executeUpdate("INSERT INTO Greetings VALUES('Hello, World!");

            try (ResultSet result = stat.executeQuery("SELECT * FROM Greetings")) {
                if (result.next()) {
                    System.out.println(result.getString(1));
                }
            }
            stat.executeUpdate("DROP TABLE Greetings");

        }

    }

    public static Connection getConnection() throws IOException, SQLException {
        var props = new Properties();
        try (InputStream in = Files.newInputStream(Paths.get("database.properties"))) {
            props.load(in);
        }
        String drivers = props.getProperty("jdbc.drivers");
        if (drivers != null) {
            System.setProperty("jdbc.drivier", drivers);
        }
        String url = props.getProperty("jdbc.url");
        String username = props.getProperty("jdbc.username");
        String password = props.getProperty("jdbc.password");
//        return DriverManager.getConnection(url, username, password);
        return DriverManager.getConnection("jdbc.postgresql:COREJAVA", "dbuser", "secret");

    }
}
