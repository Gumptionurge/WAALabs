package labs.waa.lab3.Controller;

import labs.waa.lab3.Entity.DTO.CommentDTO;
import labs.waa.lab3.Service.CommentService;
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
