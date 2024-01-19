package labs.waa.lab3.Controller;

import labs.waa.lab3.Entity.Post;
import labs.waa.lab3.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    PostService postService;
    @GetMapping("/withTitle")
    public List<Post> filterPostsWithTitle(@RequestParam String title){
    return postService.filterPostsWithTitle(title);
    }
}
