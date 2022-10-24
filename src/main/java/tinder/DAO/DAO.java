package tinder.DAO;

import java.util.List;
import java.util.Optional;

public interface DAO<A> {
    List<A> getAll();
    Optional<A> getById(String id);
    void put(A a);
    void  putLiked(A a);

    List<A> getAllLiked();
    void delete(String id);
}