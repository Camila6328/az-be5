package tinder.DAO;

import java.util.UUID;

public class Users {
    UUID userId;
    String name;
    String photoUrl;
    public Users(UUID userId, String name, String photoUrl) {
        this.userId = userId;
        this.name = name;
        this.photoUrl = photoUrl;
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
}
