package labs.waa.lab2.Controller;

import labs.waa.lab2.Entity.DTO.UserDTO;
import labs.waa.lab2.Entity.Post;
import labs.waa.lab2.Entity.User;
import labs.waa.lab2.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
     public List<User> findAll(){
        return  userService.findAll();
    }

    @PostMapping()
    public void save(@RequestBody UserDTO userDTO){
    userService.save(userDTO);
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable("id")long id){
        return userService.findById(id);
    }

    @GetMapping("/{id}/posts")
    public List<Post> findPostsById(@PathVariable long id){
        return userService.findPostsById(id);
    }
    @GetMapping("/UserWithMoreThanOnePost")
    public List<User> filterByMoreThanOnePost(){
        return userService.filterByMoreThanOnePost();
        }
}
