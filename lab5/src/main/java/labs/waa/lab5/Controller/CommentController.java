package labs.waa.lab5.Controller;

import labs.waa.lab5.Entity.DTO.CommentDTO;
import labs.waa.lab5.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    CommentService commentService;
    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    public void save(@RequestBody CommentDTO commentDTO){
        commentService.save(commentDTO);
    }

}
