package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {

    public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName(DbConn.JDBC_CLASS);
            conn = DriverManager.getConnection(DbConn.JDBC_URL,
                    DbConn.JDBC_USERNAME,
                    DbConn.JDBC_PASSWORD);
            if (conn != null) {
                //connected
                return conn;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Error:\n" + ex.getLocalizedMessage());
            return null;
        }
        return conn;
    }
}
