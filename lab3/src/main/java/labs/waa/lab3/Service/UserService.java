package labs.waa.lab3.Service;

import labs.waa.lab3.Entity.Comment;
import labs.waa.lab3.Entity.DTO.UserDTO;

import java.util.List;

public interface UserService {
    public void save(UserDTO userDTO);

    public List<UserDTO> findAll();

    public void delete(long id);

    public List<UserDTO> filterUserWithMoreThanNPosts(int n);

    public List<UserDTO> filterUserWithPostsOfTitle(String title);

    Comment findCommentOnPostOfUser(long userId, long postId, long commentId);
}
