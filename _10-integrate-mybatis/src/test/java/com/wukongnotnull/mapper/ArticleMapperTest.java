package com.wukongnotnull.mapper;

import com.wukongnotnull.domain.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

//author: 悟空非空也（B站/知乎/公众号）
@SpringBootTest
class ArticleMapperTest {

    @Autowired
    private ArticleMapper articleMapper;

    @Test
    void getArticleById() {
        System.out.println("articleMapper.getArticleById(1) = " + articleMapper.getArticleById(1));
    }

    @Test
    void getArticleList() {
        System.out.println(articleMapper.getArticleList());
    }

    @Test
    void updateArticle() {
        Article article = new Article();
       article.setId(3);
       article.setContent("我们在划水。。。");
       article.setTitle("大学生在干嘛");
        System.out.println(articleMapper.updateArticle(article));
    }

    @Test
    void addArticle() {
        Article article = new Article();
        article.setTitle("悟空非空也");
        article.setContent("我们在上课。。。。");
        System.out.println(articleMapper.addArticle(article));
    }

    @Test
    void delArticle() {
        System.out.println(articleMapper.delArticle(3));
    }
}