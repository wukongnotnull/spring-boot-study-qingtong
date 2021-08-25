package com.wukongnotnull.mapper;

import com.wukongnotnull.domain.Comment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

//author: 悟空非空也（B站/知乎/公众号）
@SpringBootTest
class CommentMapperTest {

    @Autowired
    private CommentMapper commentMapper;

    @Test
    void queryComment() {
        System.out.println("commentMapper.queryComment(1) = " + commentMapper.queryComment(1));
    }

    @Test
    void deleteComment() {
        System.out.println("commentMapper.deleteComment(6) = " + commentMapper.deleteComment(6));
    }

    @Test
    void updateComment() {
        Comment comment = new Comment();
        comment.setId(6);
        comment.setContent("暑期学生在家学习 大数据");
        comment.setAuthor("猪八戒爱美女");
        System.out.println("commentMapper.updateComment(comment) = " + commentMapper.updateComment(comment));
    }

    @Test
    void insertComment() {
        Comment comment = new Comment();
        comment.setContent("暑期学生在家学习 sb");
        comment.setAuthor("悟空非空也");
        comment.setArticleId(1);
        System.out.println("insert ----> "+commentMapper.insertComment(comment));
    }
}