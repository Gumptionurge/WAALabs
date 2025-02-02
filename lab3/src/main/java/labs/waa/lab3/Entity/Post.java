package labs.waa.lab3.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String title;
    private String content;
    private String author;
    @OneToMany(cascade=CascadeType.ALL)
    private List<Comment> comments;
}
