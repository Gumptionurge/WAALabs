package labs.waa.lab3.Repository;

import labs.waa.lab3.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {

}
