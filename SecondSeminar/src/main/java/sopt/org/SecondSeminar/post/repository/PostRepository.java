package sopt.org.SecondSeminar.post.repository;


import sopt.org.SecondSeminar.post.repository.entity.PostEntity;

import java.util.List;

public interface PostRepository {

    PostEntity getEntityById(Long postId);

    List<PostEntity> getEntityList();

    void save(PostEntity postEntity);

    void modify(Long postId, PostEntity postEntity);

    void delete(Long postId);
}
