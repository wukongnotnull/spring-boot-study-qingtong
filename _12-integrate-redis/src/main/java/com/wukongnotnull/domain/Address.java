package com.wukongnotnull.domain;

import lombok.Data;
import org.springframework.data.redis.core.index.Indexed;

//author: 悟空非空也（B站/知乎/公众号）
@Data
public class Address {

    @Indexed
    private  String nation;

    @Indexed
    private  String village;

}
