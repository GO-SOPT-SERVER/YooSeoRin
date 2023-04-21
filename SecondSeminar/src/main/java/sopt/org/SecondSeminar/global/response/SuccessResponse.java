package sopt.org.SecondSeminar.global.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Builder
public class SuccessResponse {

    private final int status;
    private final String message;
    private final Object data;
}
