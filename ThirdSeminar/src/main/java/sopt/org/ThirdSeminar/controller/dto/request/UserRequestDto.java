package sopt.org.ThirdSeminar.controller.dto.request;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UserRequestDto {

    @Email(message = "이메일 형식에 맞지 않습니다")
    @NotNull
    private final String email;
    //알아서 이메일 형식 검사해줌

    @NotBlank
    // 공백 허용 안 함.
    @Pattern(regexp = "^[가-힣a-zA-Z]{2,10}$", message = "닉네임 형식에 맞지 않습니다.")
    // 데이터 검증
    private  final String nickname;

    @NotBlank
    @Pattern(
            regexp="(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,20}",
            message = "비밀번호는 영문 대,소문자와 숫자, 특수기호가 적어도 1개 이상씩 포함된 8자 ~ 20자의 비밀번호여야 합니다."
    )
    private final String password;
}