package crm.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
//    private static final String URL = "jdbc:mysql://localhost:3306/crm_app";
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "taoladaica123";
    
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
     
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm", "root", "taoladaica123");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(); 
        }
        return connection;
    }

}