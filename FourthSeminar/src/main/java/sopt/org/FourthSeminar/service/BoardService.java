package sopt.org.FourthSeminar.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sopt.org.FourthSeminar.controller.dto.request.BoardRequestDto;
import sopt.org.FourthSeminar.domain.Board;
import sopt.org.FourthSeminar.domain.User;
import sopt.org.FourthSeminar.exception.Error;
import sopt.org.FourthSeminar.exception.model.NotFoundException;
import sopt.org.FourthSeminar.infrastructure.BoardRepository;
import sopt.org.FourthSeminar.infrastructure.UserRepository;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final UserRepository userRepository;
    private final BoardRepository boardRepository;

    @Transactional
    public void create(BoardRequestDto request) {
        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new NotFoundException(Error.NOT_FOUND_USER_EXCEPTION, Error.NOT_FOUND_USER_EXCEPTION.getMessage()));

        Board newBoard = Board.newInstance(
                user,
                request.getTitle(),
                request.getContent(),
                request.getIsPublic()
        );

        boardRepository.save(newBoard);
    }
}