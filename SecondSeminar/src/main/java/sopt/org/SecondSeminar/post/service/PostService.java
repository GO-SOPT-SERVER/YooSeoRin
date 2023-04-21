package sopt.org.SecondSeminar.post.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import sopt.org.SecondSeminar.post.controller.dto.response.LoadPostListResponseDto;
import sopt.org.SecondSeminar.post.controller.dto.response.LoadPostResponseDto;

@Service
public interface PostService {

    LoadPostResponseDto getPostById(Long postId);

    LoadPostListResponseDto getPostList();

    void CreatePost();

    void modifyPost();

    void deletePost();
}