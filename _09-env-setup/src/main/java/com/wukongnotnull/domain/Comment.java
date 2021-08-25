package com.wukongnotnull.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//author: 悟空非空也（B站/知乎/公众号）
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    private Integer id;
    private String content;
    private String author;
    //此属性名和表中的字段article_id不一致，不能自动映射，需要在application.yml中进行配置
    //mybatis.configuration.map-underscore-to-camel-case=true
    private Integer articleId;

}
