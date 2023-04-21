package sopt.org.SecondSeminar.post.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import sopt.org.SecondSeminar.post.service.domain.Post;

import java.util.List;

@Getter
@AllArgsConstructor
@Builder
public class LoadPostResponseDto {

    private Long id;
    private String title;
    private String content;
    private String authorId;
}
