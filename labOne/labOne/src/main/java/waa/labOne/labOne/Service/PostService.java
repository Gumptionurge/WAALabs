package waa.labOne.labOne.Service;

import org.springframework.stereotype.Service;
import waa.labOne.labOne.Entity.DTO.PostDTO;

import java.util.List;


public interface PostService {
    public List<PostDTO> findAll();

    public PostDTO findById(int id);

    public void save (PostDTO postDTO);

    public void delete(int id);
    public void update(int id,  PostDTO postDTO);

    List<PostDTO> findByAuthor(String author);

    List<PostDTO> findByAuthorText(String authorText);
}
