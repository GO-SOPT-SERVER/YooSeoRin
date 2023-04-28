package sopt.org.SecondSeminar.post.service.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import sopt.org.SecondSeminar.post.controller.dto.request.ModifyPostRequestDto;
import sopt.org.SecondSeminar.post.controller.dto.request.RegisterPostRequestDto;
import sopt.org.SecondSeminar.post.controller.dto.response.LoadPostListResponseDto;
import sopt.org.SecondSeminar.post.controller.dto.response.LoadPostResponseDto;
import sopt.org.SecondSeminar.post.repository.entity.PostEntity;

import java.util.List;
import java.util.stream.Collectors;

@Getter @Setter
@AllArgsConstructor
@Builder
public class Post {

    private Long id;

    private String title;

    private String content;

    private Long authorId;

    public static Post fromEntity(PostEntity entity) {
        return Post.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .content(entity.getContent())
                .authorId(entity.getAuthorId())
                .build();
    }

    public static List<Post> fromEntityList(List<PostEntity> entityList) {
        List<Post> postList = entityList.stream()
//                .map(entity -> fromEntity(entity))
                .map(Post::fromEntity)
                .collect(Collectors.toList());
        return postList;
    }

    public static Post fromRegisterPostRequestDto(RegisterPostRequestDto requestDto) {
        return Post.builder()
                .title(requestDto.getTitle())
                .content(requestDto.getContent())
                .authorId(requestDto.getAuthorId())
                .build();
    }

    public static Post fromModifyPostRequestDto(Long postId, ModifyPostRequestDto requestDto) {
        return Post.builder()
                .id(postId)
                .title(requestDto.getTitle())
                .content(requestDto.getContent())
                .authorId(requestDto.getAuthorId())
                .build();
    }

    public static PostEntity toEntity(Post post) {
        return PostEntity.builder()
                .id(post.getId())
                .title(post.getTitle())
                .content(post.getContent())
                .authorId(post.getAuthorId())
                .build();
    }

    public static LoadPostResponseDto toLoadPostResponseDto(Post post) {
        return LoadPostResponseDto.builder()
                .id(post.getId())
                .title(post.getTitle())
                .content(post.getContent())
                .authorId(post.getAuthorId())
                .build();
    }

    public static LoadPostListResponseDto toLoadPostListResponseDto(List<Post> postList) {
        List<LoadPostResponseDto> postResponseDtoList = postList.stream()
                .map(Post::toLoadPostResponseDto)
                .collect(Collectors.toList());
        return new LoadPostListResponseDto(postResponseDtoList);
    }
}

