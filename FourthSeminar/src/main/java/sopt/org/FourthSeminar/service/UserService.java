package sopt.org.FourthSeminar.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sopt.org.FourthSeminar.controller.dto.request.UserRequestDto;
import sopt.org.FourthSeminar.controller.dto.response.UserResponseDto;
import sopt.org.FourthSeminar.domain.User;
import sopt.org.FourthSeminar.exception.Error;
import sopt.org.FourthSeminar.exception.model.ConflictException;
import sopt.org.FourthSeminar.infrastructure.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public UserResponseDto create(UserRequestDto request) {
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new ConflictException(Error.ALREADY_EXIST_USER_EXCEPTION, Error.ALREADY_EXIST_USER_EXCEPTION.getMessage());
        }

        User newUser = User.newInstance(
                request.getNickname(),
                request.getEmail(),
                request.getPassword()
        );

        userRepository.save(newUser);

        return UserResponseDto.of(newUser.getId(), newUser.getNickname());
    }
}