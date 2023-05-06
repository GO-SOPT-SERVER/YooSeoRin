package sopt.org.FourthSeminar.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sopt.org.FourthSeminar.common.dto.ApiResponse;
import sopt.org.FourthSeminar.controller.dto.request.UserRequestDto;
import sopt.org.FourthSeminar.controller.dto.response.UserResponseDto;
import sopt.org.FourthSeminar.exception.Success;
import sopt.org.FourthSeminar.service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse<UserResponseDto> create(@RequestBody @Valid final UserRequestDto request) {
        return ApiResponse.success(Success.SIGNUP_SUCCESS, userService.create(request));
    }
}