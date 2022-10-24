package tinder.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    public static final String url = "jdbc:postgresql://localhost:5432/postgres";
    public static final String username = "postgres";
    public static final String password = "Pgadmin632284";
    public static  String dbDriver = "org.postgresql.Driver";
    public static final Connection conn;

    static {
        try {
            conn = DriverManager.getConnection(ConnectionDB.url,
                    ConnectionDB.username,
                    ConnectionDB.password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


