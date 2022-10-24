package tinder;

import tinder.Objects.User;

import java.util.ArrayList;
import java.util.UUID;

public class addUserDAO {
    static ArrayList<User> users = new ArrayList<>();
    public static ArrayList<User> likedUsers = new ArrayList<>();
    static UUID idOne = UUID.randomUUID();

    static User user1 = new User(idOne,"Angelina Jolie", "https://upload.wikimedia.org/wikipedia/commons/a/ad/Angelina_Jolie_2_June_2014_%28cropped%29.jpg");
    static User user2 = new User(idOne,"Brad Pitt", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4c/Brad_Pitt_2019_by_Glenn_Francis.jpg/1024px-Brad_Pitt_2019_by_Glenn_Francis.jpg");
    static User user3 = new User(idOne,"Jennifer Aniston", "https://upload.wikimedia.org/wikipedia/commons/b/bd/JenniferAnistonFeb09.jpg");
    static User user4 = new User(idOne,"Leonardo DiCaprio", "https://upload.wikimedia.org/wikipedia/commons/2/25/Leonardo_DiCaprio_2014.jpg");


    public static ArrayList<User>  addUsers() {
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        return users;
    }

    public static ArrayList<User> addUser(User user)
    {
        users.add(user);
        return users;
    }


}
