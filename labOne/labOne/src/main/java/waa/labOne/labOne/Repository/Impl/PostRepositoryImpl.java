package waa.labOne.labOne.Repository.Impl;

import org.springframework.stereotype.Repository;
import waa.labOne.labOne.Entity.Post;
import waa.labOne.labOne.Repository.PostRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PostRepositoryImpl implements PostRepository {
    List<Post>posts= new ArrayList<>();
    int productId = 3;
     {
        Post post1= new Post(1,"Welcome Note","We welcome you" +
                " to the annual shareholders' conference 2024","Adam Driver C.E.O");
        Post post2= new Post(2,"Agenda",
                "1. Prayer " +
                " 2. Communication from the Board and Management "+
                " 3. Financial Report "+
                " 4. Communication from members "+
                " A.O.B",
                "Peter Thiel P.R");

        posts.add(post1);
        posts.add(post2);

    }
    @Override
    public List<Post> findAll() {
        return posts;
    }

    @Override
    public Post findById(int id) {
        return posts.stream()
                .filter(post->post.getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public void save(Post post) {
    post.setId(productId++);
    posts.add(post);
    }

    @Override
    public void delete(int id) {
        var post= posts.stream()
                .filter(pst->pst.getId()==id)
                .findFirst().orElse(null);
        posts.remove(post);
    }

    @Override
    public void update(int id,Post post) {
        Post postToUpdate= findById(id);
        postToUpdate.setTitle(post.getTitle());
        postToUpdate.setContent(post.getContent());
        postToUpdate.setAuthor(post.getAuthor());
    }

    @Override
    public List<Post> findByAuthor(String author) {
        return posts.stream()
                .filter(pst->pst.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    @Override
    public List<Post> findByAuthorText(String authorText) {
        return posts.stream()
                .filter(pst->pst.getAuthor().contains(authorText))
                .collect(Collectors.toList());
    }
}
