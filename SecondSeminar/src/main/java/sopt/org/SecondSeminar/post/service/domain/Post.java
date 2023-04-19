package sopt.org.SecondSeminar.post.service.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@Builder
public class Post {

    private Long id;

    private String title;

    private String content;

    private String authorId;

}

