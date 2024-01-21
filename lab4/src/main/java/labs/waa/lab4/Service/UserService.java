package labs.waa.lab4.Service;

import labs.waa.lab4.Entity.Comment;
import labs.waa.lab4.Entity.DTO.UserDTO;
import labs.waa.lab4.Entity.User;

import java.util.List;

public interface UserService {
    public void save(UserDTO userDTO);

    public List<UserDTO> findAll();

    public void delete(long id);

    public List<UserDTO> filterUserWithMoreThanNPosts(int n);

    public List<UserDTO> filterUserWithPostsOfTitle(String title);

    Comment findCommentOnPostOfUser(long userId, long postId, long commentId);

    public User findUserById(long id);
}
