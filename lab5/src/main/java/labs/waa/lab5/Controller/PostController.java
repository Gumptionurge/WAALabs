package labs.waa.lab5.Controller;

import labs.waa.lab5.Entity.Post;
import labs.waa.lab5.Service.PostService;
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
