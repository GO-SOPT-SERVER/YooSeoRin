package sopt.org.SecondSeminar.post.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

//@Entity
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@AllArgsConstructor
//@Builder
@Getter
@AllArgsConstructor
@Builder
public class PostEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "post_id")
    private Long id;

//    @Column(nullable = false)
    private String title;

//    @Column(nullable = false)
    private String content;

//    @Column(name = "author_id", nullable = false)
    private Long authorId;
}
