package sopt.org.SecondSeminar.post.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
public class LoadPostListResponseDto {

    private List<LoadPostResponseDto> postList;
}
