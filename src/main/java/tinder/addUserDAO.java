package tinder;

import tinder.DAO.Users;

import java.util.ArrayList;
import java.util.UUID;

public class addUserDAO {
    static ArrayList<Users> users = new ArrayList<>();
    static ArrayList<Users> likedUsers = new ArrayList<>();
    static UUID idOne = UUID.randomUUID();

    static Users user1 = new Users(idOne,"Angelina Jolie", "https://upload.wikimedia.org/wikipedia/commons/a/ad/Angelina_Jolie_2_June_2014_%28cropped%29.jpg");
    static Users user2 = new Users(idOne,"Brad Pitt", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4c/Brad_Pitt_2019_by_Glenn_Francis.jpg/1024px-Brad_Pitt_2019_by_Glenn_Francis.jpg");
    static Users user3 = new Users(idOne,"Jennifer Aniston", "https://upload.wikimedia.org/wikipedia/commons/b/bd/JenniferAnistonFeb09.jpg");
    static Users user4 = new Users(idOne,"Leonardo DiCaprio", "https://upload.wikimedia.org/wikipedia/commons/2/25/Leonardo_DiCaprio_2014.jpg");

    public static ArrayList<Users>  addUsers() {
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        return users;
    }

    public static ArrayList<Users> addUser(Users user)
    {
        users.add(user);
        return users;
    }


}
