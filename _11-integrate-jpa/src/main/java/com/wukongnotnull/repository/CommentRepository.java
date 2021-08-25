package com.wukongnotnull.repository;
//author: 悟空非空也（B站/知乎/公众号）

import com.wukongnotnull.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Integer> {

    // 查询条件：作者不为空
    Optional<Comment> findByAuthorNotNull();

    Optional<Comment> findCommentByContent(String content);

    Comment findCommentsByArticleIdAndId(Integer articleId,Integer id);

    @Query(value = "select c from b_comment c where c.articleId=?1" ,nativeQuery = false)
    List<Comment> getCommentListNoNative(Integer articleId);

    @Query(value = "select * from b_comment where article_id=?1" ,nativeQuery = true)
    List<Comment> getCommentList(Integer articleId);

    @Modifying
    @Query(value = "update b_comment set author =?2 where id =?1",nativeQuery = true)
    int updateComment(Integer id,String author);

    @Modifying
    @Query(value = "delete  from b_comment where id =?1",nativeQuery = true)
    int deleteComment(Integer id);

    @Override
    <S extends Comment> S save(S s);

}
