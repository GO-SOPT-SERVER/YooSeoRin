package sopt.org.SecondSeminar.post.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sopt.org.SecondSeminar.post.controller.dto.request.ModifyPostRequestDto;
import sopt.org.SecondSeminar.post.controller.dto.request.RegisterPostRequestDto;
import sopt.org.SecondSeminar.post.controller.dto.response.LoadPostListResponseDto;
import sopt.org.SecondSeminar.post.controller.dto.response.LoadPostResponseDto;
import sopt.org.SecondSeminar.post.repository.PostRepository;
import sopt.org.SecondSeminar.post.repository.entity.PostEntity;
import sopt.org.SecondSeminar.post.service.domain.Post;

import java.util.List;


@RequiredArgsConstructor
@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Override
    public LoadPostResponseDto getPostById(Long postId) {
        PostEntity entity = postRepository.getEntityById(postId);
        Post post = Post.fromEntity(entity);
        return Post.toLoadPostResponseDto(post);
    }

    @Override
    public LoadPostListResponseDto getPostList() {
        List<PostEntity> entityList = postRepository.getEntityList();
        List<Post> posts = Post.fromEntityList(entityList);
        return Post.toLoadPostListResponseDto(posts);
    }

    @Override
    public void createPost(RegisterPostRequestDto requestDto) {
        Post post = Post.fromRegisterPostRequestDto(requestDto);
        PostEntity entity = Post.toEntity(post);
        postRepository.save(entity);
    }

    @Override
    public void modifyPost(Long postId, ModifyPostRequestDto requestDto) {
        Post post = Post.fromModifyPostRequestDto(postId, requestDto);
        PostEntity entity = Post.toEntity(post);
        postRepository.modify(postId, entity);
    }

    @Override
    public void deletePost(Long postId) {
        postRepository.delete(postId);
    }


}
