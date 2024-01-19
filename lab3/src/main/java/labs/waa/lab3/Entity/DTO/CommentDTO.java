package labs.waa.lab3.Entity.DTO;

import labs.waa.lab3.Entity.Post;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO {
    private String name;
    private long postId;
}
