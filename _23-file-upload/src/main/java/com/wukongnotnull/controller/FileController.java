package com.wukongnotnull.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

//author: 悟空非空也（B站/知乎/公众号）
@Controller
public class FileController {

    // 显示上传文件的页面
    @GetMapping("/upload")
    public String upload(){
        return "upload";
    }

    // 执行上传
    @PostMapping("/uploadFile")
    public String uploadFile(@RequestParam("fileUpload") MultipartFile[] uploadFiles,
                             Model model,HttpServletRequest request
        ){

        // 遍历文件数组
        for (MultipartFile file : uploadFiles) {
            // 处理文件名
            String originalFilename = file.getOriginalFilename();
            String newFilename = UUID.randomUUID() +"-"+ originalFilename;
            // 确定文件存放的位置  ： 放入服务器中
           // String newPath = request.getServletContext().getRealPath("/uploads");
            String newPath = "/Users/mac/Documents/GitHub/spring-boot-study-qingtong/_23-file-upload/upload2";
            System.out.println(newPath);

            // 创建指定的空目录
            File file1 = new File(newPath);
            if(!file1.exists()){
                file1.mkdir();
            }

            // 根据空目录和新文件名 创建空文件
            File file2 = new File(newPath, newFilename);

            try {
                file.transferTo(file2);
                // 返回提示信息给浏览器：上传成功
                model.addAttribute("uploadStatus","上传成功");
            } catch (IOException e) {
                e.printStackTrace();
                // 返回提示信息给浏览器：上传失败
                model.addAttribute("uploadStatus","上传失败");
            }

        }
        return "upload";
    }
}
