package labs.waa.lab3.Service;

import labs.waa.lab3.Entity.DTO.PostDTO;
import labs.waa.lab3.Entity.Post;

import java.util.List;

public interface PostService {

    public Post save(PostDTO postDTO);
    public List<Post> findAll();
    public List<Post> filterPostsWithTitle(String title);
    public void delete(long id);
    public PostDTO findById(long id);
}
