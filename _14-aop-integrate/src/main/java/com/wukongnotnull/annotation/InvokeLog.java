package com.wukongnotnull.annotation;
//author: 悟空非空也（B站/知乎/公众号）

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface InvokeLog {

}
