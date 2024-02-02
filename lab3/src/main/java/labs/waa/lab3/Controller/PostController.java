package labs.waa.lab3.Controller;

import labs.waa.lab3.Entity.DTO.PostDTO;
import labs.waa.lab3.Entity.Post;
import labs.waa.lab3.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    PostService postService;
    @GetMapping("/withTitle")
    public List<Post> filterPostsWithTitle(@RequestParam String title){
    return postService.filterPostsWithTitle(title);
    }

    @PostMapping()
    public void save(@RequestBody PostDTO postDTO){
        postService.save(postDTO);
    }

    @GetMapping()
    public List<Post> findAll(){
        return postService.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")long id){
        postService.delete(id);
    }

    @GetMapping("/{id}")
    public PostDTO findById(@PathVariable("id")long id){
        return postService.findById(id);
    }
}
