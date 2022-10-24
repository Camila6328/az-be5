package tinder.DAO;

import lombok.SneakyThrows;
import tinder.Objects.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

public class UsersDAO implements DAO<User> {
    private final Connection conn;

    public UsersDAO(Connection conn) {
        this.conn = conn;
    }

    @SneakyThrows
    @Override
    public ArrayList<User> getAll() {
        PreparedStatement stmt = conn.prepareStatement("select * from users");
        ResultSet resultSet = stmt.executeQuery();
        ArrayList<User> users = new ArrayList<>();
        HashMap<Integer, User> data = new HashMap<>();
        int i = 0;
        while (resultSet.next()) {
            User s = new User(
                    resultSet.getString("id"),
                    resultSet.getString("username"),
                    resultSet.getString("pass"),
                    resultSet.getString("imgurl")
            );
            users.add(s);
            data.put(i, s);
            i++;
        }
        return users;
    }
    public HashMap<String, User> getAllData() throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("select * from users");
        ResultSet resultSet = stmt.executeQuery();
        HashMap<String, User> data = new HashMap<>();
        //int i = 0;
        while (resultSet.next()) {
            User s = new User(
                    resultSet.getString("id"),
                    resultSet.getString("username"),
                    resultSet.getString("pass"),
                    resultSet.getString("imgurl")
            );
            data.put("data", s);
            //  i++;
        }
        return data;
    }

    @SneakyThrows
    @Override
    public Optional<User> getById(String id) {
        PreparedStatement stmt = conn.prepareStatement("select * from users where id = ?");
        stmt.setString(1, id);
        ResultSet resultSet = stmt.executeQuery();
        if(resultSet.next()) {
            return Optional.of(new User(resultSet.getString("id"),
                    resultSet.getString("username"),
                    resultSet.getString("pass"),
                    resultSet.getString("imgurl")
            ));
        }
        else return Optional.empty();
    }

    @SneakyThrows
    @Override
    public void put(User user) {
        PreparedStatement st = conn.prepareStatement("insert into users (id, username, pass, imgurl) values (?,?,?,?);commit;");
        st.setString(1, user.getUserId().toString());
        st.setString(2, user.getName());
        st.setString(3, user.getPassword());
        st.setString(4, user.getPhotoUrl());
        st.execute();
    }

    @SneakyThrows
    @Override
    public void putLiked(User user) {
        PreparedStatement st = conn.prepareStatement("insert into liked_users (id, username, pass, imgurl) values (?,?,?,?);commit;");
        st.setString(1, user.getUserId().toString());
        st.setString(2, user.getName());
        st.setString(3, user.getPassword());
        st.setString(4, user.getPhotoUrl());
        st.setString(4, String.valueOf(0));
        st.execute();
    }

    @SneakyThrows
    @Override
    public ArrayList<User> getAllLiked() {
        PreparedStatement stmt = conn.prepareStatement("select * from liked_users");
        ResultSet resultSet = stmt.executeQuery();
        ArrayList<User> users = new ArrayList<>();
        HashMap<Integer, User> data = new HashMap<>();
        int i = 0;
        while (resultSet.next()) {
            User s = new User(
                    resultSet.getString("id"),
                    resultSet.getString("username"),
                    resultSet.getString("pass"),
                    resultSet.getString("imgurl")
            );
            users.add(s);
            data.put(i, s);
            i++;
        }
        return users;
    }

    @SneakyThrows
    @Override
    public void delete(String id) {
        PreparedStatement st = conn.prepareStatement("delete from users where id = ?");
        st.setString(1, id);
        st.execute();
    }

}