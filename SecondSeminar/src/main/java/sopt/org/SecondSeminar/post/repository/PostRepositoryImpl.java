package sopt.org.SecondSeminar.post.repository;

import org.springframework.stereotype.Repository;
import sopt.org.SecondSeminar.post.repository.entity.PostEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PostRepositoryImpl implements PostRepository {

    private static final Map<Long, PostEntity> store = new HashMap<>();
    private static long entitySeq = 0L;
//    private static long sequence = 0L;

    @Override
    public PostEntity getEntityById(Long postId) {
        return store.get(postId);
    }

    @Override
    public List<PostEntity> getEntityList() {
        return new ArrayList<>(store.values());
    }

    @Override
    public void save(PostEntity postEntity) {
        PostEntity entity = PostEntity.builder()
                .id(++entitySeq)
                .title(postEntity.getTitle())
                .content(postEntity.getContent())
                .authorId(postEntity.getAuthorId())
                .build();
        store.put(entity.getId(), entity);

    }

    @Override
    public void modify(Long postId, PostEntity postEntity) {
        PostEntity modifyEntity = PostEntity.builder()
                .id(postId)
                .title(postEntity.getTitle())
                .content(postEntity.getContent())
                .authorId(postEntity.getAuthorId())
                .build();
        store.put(postId, modifyEntity);
    }

    @Override
    public void delete(Long postId) {
        store.put(postId, null);
    }
}
