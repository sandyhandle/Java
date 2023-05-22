package BusResv;


import java.sql.*;
public class DbConnection {
    private static final String url = "jdbc:mysql://localhost:3306/busresv";
    private static final String userName = "root";
    private static final String password = "8xhx3j9G&NP8Ms";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,userName,password);
    }
}
