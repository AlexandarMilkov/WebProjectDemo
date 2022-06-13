package softuni.webprojectdemo.demo.models.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDateTime created;

    @Column(columnDefinition = "TEXT")
    private String text;

    @ManyToOne
    private User author;


}
