package labs.waa.lab2.Service;

import labs.waa.lab2.Entity.DTO.UserDTO;
import labs.waa.lab2.Entity.Post;
import labs.waa.lab2.Entity.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    public void save(UserDTO userDTO);
    public User findById(long id);

    List<Post> findPostsById(long id);

    List<User> filterByMoreThanOnePost();
}
