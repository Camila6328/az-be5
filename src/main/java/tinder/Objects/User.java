package tinder.Objects;
import java.util.UUID;

public class User {
        UUID userId;
        String name;
        String photoUrl;
        String password;


    public User(UUID userId, String name, String photoUrl) {
            this.userId = userId;
            this.name = name;
            this.photoUrl = photoUrl;
        }

    public User(String userId, String name, String password, String photoUrl) {
        this.userId = UUID.fromString(userId.toString());
        this.name = name;
        this.photoUrl = photoUrl;
        this.password = password;
    }

    public String getName() {
            return name;
        }
        public String getPhotoUrl() {
            return photoUrl;
        }

        public UUID getUserId() {
            return userId;
        }

    public String getPassword() {
        return password;
    }
}

