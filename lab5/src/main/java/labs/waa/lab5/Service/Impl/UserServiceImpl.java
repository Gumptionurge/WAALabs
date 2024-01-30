package labs.waa.lab5.Service.Impl;

import labs.waa.lab5.Aspect.Annotations.ExecutionTime;
import labs.waa.lab5.Entity.Comment;
import labs.waa.lab5.Entity.DTO.UserDTO;
import labs.waa.lab5.Entity.Post;
import labs.waa.lab5.Entity.User;
import labs.waa.lab5.Repository.UserRepository;
import labs.waa.lab5.Service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ModelMapper modelMapper;

    private PasswordEncoder passwordEncoder;

    @Override
    public void save(UserDTO userDTO) {
        List<Post> posts = userDTO.getPosts().stream()
                .map(pstDTO -> modelMapper.map(pstDTO, Post.class))
                .collect(Collectors.toList());

        User user = modelMapper.map(userDTO, User.class);
        user.setPosts(posts);
        userRepository.save(user);

    }

    @Override
    public List<UserDTO> findAll() {
        return userRepository.findAll().stream()
                .map(user -> modelMapper.map(user, UserDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public void delete(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<UserDTO> filterUserWithMoreThanNPosts(int n) {
        List<User> users = userRepository.findUserWithMoreThanNPosts(n);
        return users.stream()
                .map(user -> modelMapper.map(user, UserDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<UserDTO> filterUserWithPostsOfTitle(String title) {
        return userRepository.findUserWithPostsOfTitle(title).stream()
                .map(user -> modelMapper.map(user, UserDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public Comment findCommentOnPostOfUser(long userId, long postId, long commentId) {
        User user = userRepository.findUserById(userId);
        if (user != null) {
            Post post = user
                    .getPosts()
                    .stream()
                    .filter(pst -> pst.getId() == postId)
                    .findAny().orElse(null);
            if (post != null) {
                return post.getComments().stream()
                        .filter(comment -> comment.getId() == commentId)
                        .findFirst().orElse(null);
            }
        }
        return null;
    }

    @ExecutionTime
    @Override
    public User findUserById(long id) {
        return userRepository.findUserById(id);
    }


    @Bean
    public PasswordEncoder getPasswordEncoder() {
        if (this.passwordEncoder == null) this.passwordEncoder = new BCryptPasswordEncoder();
        return this.passwordEncoder;
    }

    @Override
    public User findByUserName(String userName) {
        return userRepository.findByUserNameIgnoreCase(userName).orElse(null);
    }

    @Override
    public User loadUserByUsername(String username) {
        if (username == null || username.isEmpty())
            throw new UsernameNotFoundException("Please provide a valid username");
        User user = userRepository.findByUserNameIgnoreCase(username).orElse(null);

        if (user == null)
            throw new UsernameNotFoundException("We could not find any user with the username: " + username);
        return user;
    }


}