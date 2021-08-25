package com.wukongnotnull.mapper;

import com.wukongnotnull.domain.Comment;
import org.apache.ibatis.annotations.*;

//author: 悟空非空也（B站/知乎/公众号）
@Mapper
public interface CommentMapper {

    // 查询
    @Select("select * from b_comment where id = #{id}")
    public Comment queryComment(Integer id);


    // 删除
    @Delete("delete from b_comment where id = #{id}")
    public int deleteComment(@Param("id") Integer aaaaaaa);

    // 修改
    @Update("update b_comment set content = #{content} ,author=#{author} where id = #{id}")
    int updateComment(Comment comment);

    // 添加
    @Insert("insert into b_comment(content,author,article_id) values(#{content},#{author},#{articleId})")
    int insertComment(Comment comment);












}
