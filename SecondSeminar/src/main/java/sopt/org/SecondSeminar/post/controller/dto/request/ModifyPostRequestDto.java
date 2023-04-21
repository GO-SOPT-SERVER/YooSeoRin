package sopt.org.SecondSeminar.post.controller.dto.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ModifyPostRequestDto {

    private String title;

    private String content;

    private Long authorId;
}
