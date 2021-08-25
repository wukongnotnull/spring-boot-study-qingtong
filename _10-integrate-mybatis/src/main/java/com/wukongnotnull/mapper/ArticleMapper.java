package com.wukongnotnull.mapper;
//author: 悟空非空也（B站/知乎/公众号）

import com.wukongnotnull.domain.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ArticleMapper {
    // 查询单文章
    Article getArticleById(int id);

    // 查询文章列表
    List<Article> getArticleList();

    // 修改文章
    int updateArticle(Article article);

    // 添加文章
    int addArticle(Article article);

    // 删除文章
    int delArticle(int id);

}
