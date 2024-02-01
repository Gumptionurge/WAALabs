package labs.waa.lab3.Service.Impl;

import labs.waa.lab3.Entity.DTO.PostDTO;
import labs.waa.lab3.Entity.Post;
import labs.waa.lab3.Repository.PostRepository;
import labs.waa.lab3.Service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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
    public void delete(long id) {
        postRepository.deleteById(id);
    }

    @Override
    public PostDTO findById(long id) {
        Post post = postRepository.findById(id).orElse(null);
        if(post!=null){
        return modelMapper.map(post, PostDTO.class);
        }
        return null;
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
