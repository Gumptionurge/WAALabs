package labs.waa.lab2.Service.Impl;

import labs.waa.lab2.Entity.DTO.UserDTO;
import labs.waa.lab2.Entity.Post;
import labs.waa.lab2.Entity.User;
import labs.waa.lab2.Repository.UserRepository;
import labs.waa.lab2.Service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        List<Post> posts = userDTO.getPosts()
                .stream()
                .map(postDTO -> modelMapper.map(postDTO, Post.class))
                .collect(Collectors.toList());
        user.setPosts(posts);
        userRepository.save(user);
    }

    @Override
    public User findById(long id) {
         return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<Post> findPostsById(long id) {
        User user =userRepository.findById(id).orElse(null);
        return user!=null?user.getPosts():null;
    }

    @Override
    public List<User> filterByMoreThanOnePost() {
        return userRepository.findAll()
                .stream()
                .filter(user->user.getPosts().size()>1)
                .collect(Collectors.toList());
    }
}
