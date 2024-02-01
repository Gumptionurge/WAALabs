package labs.waa.lab4.Service.Impl;

import labs.waa.lab4.Entity.DTO.PostDTO;
import labs.waa.lab4.Entity.DTO.UserDTO;
import labs.waa.lab4.Entity.Post;
import labs.waa.lab4.Entity.User;
import labs.waa.lab4.Repository.PostRepository;
import labs.waa.lab4.Service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository postRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<Post> filterPostsWithTitle(String title) {

        return postRepository.findPostByTitle(title);
    }

    @Override
    public Post save(PostDTO postDTO) {

        Post post = modelMapper.map(postDTO, Post.class);
        return postRepository.save(post);
    }

        @Override
        public List<PostDTO> findAll() {
            return postRepository.findAll().stream()
                    .map(post -> modelMapper.map(post, PostDTO.class))
                    .collect(Collectors.toList());
        }

}
