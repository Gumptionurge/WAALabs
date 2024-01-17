package waa.labOne.labOne.Service.Impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import waa.labOne.labOne.Entity.DTO.PostDTO;
import waa.labOne.labOne.Entity.Post;
import waa.labOne.labOne.Repository.Impl.PostRepositoryImpl;
import waa.labOne.labOne.Repository.PostRepository;
import waa.labOne.labOne.Service.PostService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository postRepository;
    @Autowired
    ModelMapper modelMapper;
    public List<PostDTO> findAll(){
       return postRepository.findAll().stream()
                .map(pst->modelMapper.map(pst, PostDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public PostDTO findById(int id) {
        return modelMapper.map(postRepository.findById(id), PostDTO.class);
    }

    @Override
    public void save(PostDTO postDTO) {
        postRepository.save(modelMapper.map(postDTO, Post.class));
    }

    @Override
    public void delete(int id) {
        postRepository.delete(id);
    }
    @Override
    public void update(int id,  PostDTO postDTO) {
        postRepository.update(id, modelMapper.map(postDTO, Post.class));
    }

    @Override
    public List<PostDTO> findByAuthor(String author) {
        List<Post> postsByAuthor = postRepository.findByAuthor(author);
        return postsByAuthor.stream()
                .map(pst->modelMapper.map(pst,PostDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<PostDTO> findByAuthorText(String authorText) {
        List<Post>postsByAuthorText=postRepository.findByAuthorText(authorText);
        return postsByAuthorText.stream()
                .map(pst->modelMapper.map(pst,PostDTO.class))
                .collect(Collectors.toList());
    }
}
