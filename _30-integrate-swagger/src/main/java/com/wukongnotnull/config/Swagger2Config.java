package com.wukongnotnull.config;
/* author: 悟空非空也（B站/知乎/公众号） */



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createDocket(Environment environment) {
        Profiles of = Profiles.of("test", "dev");

        boolean flag = environment.acceptsProfiles(of);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(this.apiInfo())
                .groupName("wukong")
                .enable(flag)
                .select()

                          //根据基包路径选择接口
                .apis(RequestHandlerSelectors.basePackage("com.wukongnotnull.controller"))
                .build();
    }



    //配置文档信息
    private ApiInfo apiInfo() {
        Contact contact = new Contact("悟空非空也", "http://wukongnotnull.com", "1390128154@qq.com");
        return new ApiInfo(
                "悟空的项目api文档", // 标题
                "实现对用户模块的增删改查", // 描述
                "v1.0", // 版本
                "http://terms.service.url/组织链接", // 组织链接
                contact, // 联系人信息
                "Apach 2.0 许可", // 许可
                "许可链接", // 许可连接
                new ArrayList<>()// 扩展
        );
    }

}