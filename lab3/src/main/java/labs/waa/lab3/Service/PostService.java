package labs.waa.lab3.Service;

import labs.waa.lab3.Entity.Post;

import java.util.List;

public interface PostService {
    public List<Post> filterPostsWithTitle(String title);
}
