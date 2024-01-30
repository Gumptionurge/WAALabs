package labs.waa.lab5.Repository;

import labs.waa.lab5.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findPostByTitle(String title);
}
