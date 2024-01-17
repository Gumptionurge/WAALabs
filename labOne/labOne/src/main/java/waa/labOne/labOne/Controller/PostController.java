package waa.labOne.labOne.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import waa.labOne.labOne.Entity.DTO.PostDTO;
import waa.labOne.labOne.Entity.Post;
import waa.labOne.labOne.Service.PostService;

import java.util.List;

@RestController
@RequestMapping("/posts")

public class PostController {
    @Autowired
    PostService postService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<PostDTO> findAll(){
    return postService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostDTO> findById(@PathVariable("id")int id){
        var postDTO= postService.findById(id);
        return ResponseEntity.ok(postDTO);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public void save(@RequestBody PostDTO postDTO){
    postService.save(postDTO);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        postService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") int productId, @RequestBody PostDTO postDTO) {
        postService.update(productId,postDTO);
    }
    @GetMapping("/filterByAuthor")
    public List<PostDTO> findByAuthor(@RequestParam String author){
        return postService.findByAuthor(author);
    }
    @GetMapping("/filterByAuthorText")
    public List<PostDTO>findByAuthorText(@RequestParam String authorText){
        return postService.findByAuthorText(authorText);
    }
}
