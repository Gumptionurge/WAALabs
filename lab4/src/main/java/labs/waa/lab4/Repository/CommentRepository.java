package labs.waa.lab4.Repository;

import labs.waa.lab4.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {

}
