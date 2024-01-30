package labs.waa.lab5.Service;

import labs.waa.lab5.Entity.Comment;
import labs.waa.lab5.Entity.DTO.UserDTO;
import labs.waa.lab5.Entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

public interface UserService extends UserDetailsService {
    public void save(UserDTO userDTO);

    public List<UserDTO> findAll();

    public void delete(long id);

    public List<UserDTO> filterUserWithMoreThanNPosts(int n);

    public List<UserDTO> filterUserWithPostsOfTitle(String title);

    Comment findCommentOnPostOfUser(long userId, long postId, long commentId);

    public User findUserById(long id);

    PasswordEncoder getPasswordEncoder();

    User findByUserName(String userName);

    User loadUserByUsername(String username);
}
