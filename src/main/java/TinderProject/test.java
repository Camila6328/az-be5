package TinderProject;

import TinderProject.DAO.LikesDAO;
import TinderProject.DAO.UsersDAO;
import TinderProject.Objects.User;

import java.util.ArrayList;

import static TinderProject.Database.ConnectionDB.conn;

public class test {
    public static void main(String[] args) {
        LikesDAO ld = new LikesDAO(conn);
        UsersDAO ud = new UsersDAO(conn);
        ArrayList<User> users = ud.getAll();


//        for (int i = 0; i < users.size(); i++) {
//            Likes liked = new Likes(users.get(i).getId(), users.get(i).getUsername(),
//                    "yes", users.get(i).getImg(), "no",null);
//            ld.put(liked);
//
//        }
    }
}
