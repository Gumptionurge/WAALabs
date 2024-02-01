package labs.waa.lab4.Service;

import labs.waa.lab4.Entity.DTO.PostDTO;
import labs.waa.lab4.Entity.DTO.UserDTO;
import labs.waa.lab4.Entity.Post;

import java.util.List;

public interface PostService {
    public List<Post> filterPostsWithTitle(String title);
    public Post save(PostDTO postDTO);
    public List<PostDTO> findAll();
}
