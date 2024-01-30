package labs.waa.lab5.Repository;

import labs.waa.lab5.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {

}
