package lesson23sql1;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLInsertApp {

  public static void main(String[] args) throws SQLException {
//    Connection conn = DriverManager.getConnection(
//        "jdbc:postgresql://localhost:5432/postgres",
//        "postgres",
//        "Pgadmin632284"
//    );

    SQLConnectionOnly conn = new SQLConnectionOnly();
    PreparedStatement st = conn.connect().prepareStatement("insert into person (id, name) values (?, ?)");

    st.setInt(1, 41);
    st.setString(2, "Camila I");
    st.execute();

    st.setInt(1, 42);
    st.setString(2, "Islam II");
    st.execute();

  }


}
