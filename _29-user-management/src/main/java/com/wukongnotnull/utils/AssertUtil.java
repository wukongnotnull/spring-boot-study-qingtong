package com.wukongnotnull.utils;

/**
 * author: 悟空非空也（B站/知乎/公众号）
 */

/**
 *  提示语工具类
 */
public class AssertUtil {

    public static void isTrue(boolean flag, Integer code, String message)  {
        if (flag) {
            throw new ParamsException(code, message);
        }
        System.out.println("isTrue method is used");
    }

}

