package com.wukongnotnull.repository;

import com.wukongnotnull.domain.Comment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

//author: 悟空非空也（B站/知乎/公众号）
@SpringBootTest
class CommentRepositoryTest {

    @Autowired
    private  CommentRepository commentRepository;

    @Test
    void findAll() {
        List<Comment> commentList = commentRepository.findAll();
        for(Comment comment:commentList){
            System.out.println(comment);
        }

    }

    @Test
    void count() {
        System.out.println("commentRepository.count() = " + commentRepository.count());
    }

    @Test
    void findById(){
        Optional<Comment> optionalComment = commentRepository.findById(1);
        if (optionalComment.isPresent()) {
            Comment comment1 = optionalComment.get();
            System.out.println(comment1);
        }

    }

}