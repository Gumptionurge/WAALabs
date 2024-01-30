package labs.waa.lab5.Repository;

import labs.waa.lab5.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query("SELECT u FROM User u WHERE SIZE(u.posts) > :n")
    List<User> findUserWithMoreThanNPosts(@Param("n") int n);
    @Query("SELECT u FROM User u JOIN u.posts p WHERE p.title=:title")
    public List<User> findUserWithPostsOfTitle(@Param("title")String title);

    public User findUserById(long id);

    User findByEmail(String username);

    boolean existsByEmail(String mail);

    Optional<User> findByUserNameIgnoreCase(String username);


}
