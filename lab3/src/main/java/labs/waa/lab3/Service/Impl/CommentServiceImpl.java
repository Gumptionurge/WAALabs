package labs.waa.lab3.Service.Impl;

import labs.waa.lab3.Entity.Comment;
import labs.waa.lab3.Entity.DTO.CommentDTO;
import labs.waa.lab3.Entity.Post;
import labs.waa.lab3.Repository.CommentRepository;
import labs.waa.lab3.Repository.PostRepository;
import labs.waa.lab3.Service.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentRepository commentRepository;
    @Autowired
    PostRepository postRepository;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public void save(CommentDTO commentDTO) {
        Comment comment= modelMapper.map(commentDTO,Comment.class);
        long id =commentDTO.getPostId();
        Optional<Post> postOptional =postRepository.findById(id);
        postOptional.ifPresent(pst->{
        comment.setPost(pst);
        pst.getComments().add(comment);
        postRepository.save(pst);
        commentRepository.save(comment);
        });

    }


}
