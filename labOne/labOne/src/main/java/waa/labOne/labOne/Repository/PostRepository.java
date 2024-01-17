package waa.labOne.labOne.Repository;

import waa.labOne.labOne.Entity.Post;

import java.util.List;

public interface PostRepository {
    public List<Post>findAll();
    public Post findById(int id);
    public void save(Post post);
    public void delete(int id);
    public void update(int id,Post post);
    public List<Post>findByAuthor(String author);

    List<Post> findByAuthorText(String authorText);
}
