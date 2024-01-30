package labs.waa.lab5.Controller;


import labs.waa.lab5.Entity.Comment;
import labs.waa.lab5.Entity.DTO.UserDTO;
import labs.waa.lab5.Entity.User;
import labs.waa.lab5.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping()
    public void save(@RequestBody UserDTO userDTO){
    userService.save(userDTO);
    }

    @GetMapping()
    public List<UserDTO> findAll(){
        return userService.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")long id){
        userService.delete(id);
    }

    @GetMapping("/userWithMoreThanNPosts")
    public List<UserDTO>filterUsersWithMoreThanNPosts(@RequestParam int n){
        return userService.filterUserWithMoreThanNPosts(n);
    }

    @GetMapping("/posts/filterByTitle")
    public List<UserDTO>filterUsersWithPostsOfTitle(@RequestParam String title){
        return userService.filterUserWithPostsOfTitle(title);
    }
    //localhost:8080/users/1/posts/1/comments/1
    @GetMapping("/{userId}/posts/{postId}/comments/{commentId}")
    public Comment findCommentOnPostOfUser(@PathVariable("userId") int userId,
                                           @PathVariable("postId") int postId,
                                           @PathVariable("commentId") int commentId){
        return userService.findCommentOnPostOfUser(userId,postId,commentId);
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable("id")long id){
        return userService.findUserById(id);
    }



}
