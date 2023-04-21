package sopt.org.SecondSeminar.post.controller.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ModifyPostRequestDto {

    private String title;

    private String content;

    private Long authorId;
}
