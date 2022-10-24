package lesson23sql1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnectionOnly {

  public Connection connect() throws SQLException {
    Connection conn = DriverManager.getConnection(
        "jdbc:postgresql://localhost:5432/postgres",
        "postgres",
        "Pgadmin632284"
    );
    return conn;
  }


}
