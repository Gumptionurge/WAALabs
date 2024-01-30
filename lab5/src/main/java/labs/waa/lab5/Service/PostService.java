package labs.waa.lab5.Service;

import labs.waa.lab5.Entity.Post;

import java.util.List;

public interface PostService {
    public List<Post> filterPostsWithTitle(String title);
}
