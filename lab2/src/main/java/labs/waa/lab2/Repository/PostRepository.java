package labs.waa.lab2.Repository;

import labs.waa.lab2.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
