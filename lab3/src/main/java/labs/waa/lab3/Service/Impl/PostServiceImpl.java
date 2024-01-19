package labs.waa.lab3.Service.Impl;

import labs.waa.lab3.Entity.Post;
import labs.waa.lab3.Repository.PostRepository;
import labs.waa.lab3.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository postRepository;
    @Override
    public List<Post> filterPostsWithTitle(String title) {
     return postRepository.findPostByTitle(title);
    }
}
