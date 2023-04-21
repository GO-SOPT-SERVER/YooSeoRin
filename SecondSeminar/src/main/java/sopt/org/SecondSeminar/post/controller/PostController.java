package sopt.org.SecondSeminar.post.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sopt.org.SecondSeminar.global.response.JsonResponse;
import sopt.org.SecondSeminar.post.controller.dto.request.ModifyPostRequestDto;
import sopt.org.SecondSeminar.post.controller.dto.request.RegisterPostRequestDto;
import sopt.org.SecondSeminar.post.controller.dto.response.LoadPostListResponseDto;
import sopt.org.SecondSeminar.post.controller.dto.response.LoadPostResponseDto;
import sopt.org.SecondSeminar.post.service.PostService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    @GetMapping("/{postId}")
    public ResponseEntity<?> getPostById(@PathVariable Long postId) {
        LoadPostResponseDto response = postService.getPostById(postId);
        return JsonResponse.okWithData(HttpStatus.OK, "포스트 조회를 성공했습니다.", response);
    }

    @GetMapping
    public ResponseEntity<?> getPostList() {
        LoadPostListResponseDto response = postService.getPostList();
        return JsonResponse.okWithData(HttpStatus.OK, "포스트 목록 조회를 성공했습니다.", response);
    }

    @PostMapping
    public ResponseEntity<?> createPost(@RequestBody RegisterPostRequestDto request) {
        postService.createPost(request);
        return JsonResponse.ok(HttpStatus.OK, "포스트 생성을 성공했습니다");
    }

    @PutMapping("/{postId}")
    public ResponseEntity<?> modifyPost(@PathVariable Long postId, @RequestBody ModifyPostRequestDto request) {
        postService.modifyPost(postId, request);
        return JsonResponse.ok(HttpStatus.OK, "포스트 수정을 성공했습니다");
    }

    @DeleteMapping("/{postId}")
    public ResponseEntity<?> deletePost(@PathVariable Long postId) {
        postService.deletePost(postId);
        return JsonResponse.ok(HttpStatus.OK, "포스트 삭제를 성공했습니다");
    }
}
