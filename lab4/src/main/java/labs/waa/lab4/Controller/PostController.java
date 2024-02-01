package labs.waa.lab4.Controller;

import labs.waa.lab4.Entity.DTO.PostDTO;
import labs.waa.lab4.Entity.DTO.UserDTO;
import labs.waa.lab4.Entity.Post;
import labs.waa.lab4.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    PostService postService;


    @PostMapping()
    public void save(@RequestBody PostDTO postDTO){
        postService.save(postDTO);
    }

    @GetMapping()
    public List<PostDTO> findAll(){
        return postService.findAll();
    }


    @GetMapping("/withTitle")
    public List<Post> filterPostsWithTitle(@RequestParam String title){
    return postService.filterPostsWithTitle(title);
    }
}
