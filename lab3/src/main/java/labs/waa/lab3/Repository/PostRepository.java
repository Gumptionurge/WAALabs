package labs.waa.lab3.Repository;

import labs.waa.lab3.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findPostByTitle(String title);
}
