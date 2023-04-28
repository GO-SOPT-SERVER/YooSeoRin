package sopt.org.SecondSeminar.post.service;

import org.springframework.stereotype.Service;
import sopt.org.SecondSeminar.post.controller.dto.request.ModifyPostRequestDto;
import sopt.org.SecondSeminar.post.controller.dto.request.RegisterPostRequestDto;
import sopt.org.SecondSeminar.post.controller.dto.response.LoadPostListResponseDto;
import sopt.org.SecondSeminar.post.controller.dto.response.LoadPostResponseDto;

@Service
public interface PostService {

    LoadPostResponseDto getPostById(Long postId);

    LoadPostListResponseDto getPostList();

    void createPost(RegisterPostRequestDto requestDto);

    void modifyPost(Long postId, ModifyPostRequestDto requestDto);

    void deletePost(Long postId);
}