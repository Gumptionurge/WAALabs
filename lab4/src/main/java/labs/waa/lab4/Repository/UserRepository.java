package labs.waa.lab4.Repository;

import labs.waa.lab4.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query("SELECT u FROM User u WHERE SIZE(u.posts) > :n")
    List<User> findUserWithMoreThanNPosts(@Param("n") int n);
    @Query("SELECT u FROM User u JOIN u.posts p WHERE p.title=:title")
    public List<User> findUserWithPostsOfTitle(@Param("title")String title);

    public User findUserById(long id);
}
