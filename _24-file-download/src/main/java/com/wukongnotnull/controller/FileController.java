package com.wukongnotnull.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

//author: 悟空非空也（B站/知乎/公众号）
@Controller
public class FileController {

    @GetMapping("/download")
    public String downloadShow(){
        return "download";
    }

    @RequestMapping("/downloadFile")
    public ResponseEntity<byte[]> getdownloadFile(String filename, HttpServletRequest request)  {
        String dirPath= "/Users/mac/Desktop/download/";
        File file = new File(dirPath, filename);

        HttpHeaders httpHeaders = new HttpHeaders();

        // 通知浏览器以下载方式打开（下载前对文件名进行转码,处理中文名乱码问题）
        filename=this.getFilename(request,filename);

        httpHeaders.setContentDispositionFormData("attachment" ,filename);
        httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);

        ResponseEntity<byte[]> responseEntity =null;

        try {
            responseEntity = new ResponseEntity<>(FileUtils.readFileToByteArray(file), httpHeaders, HttpStatus.OK);

        } catch (IOException e) {
            responseEntity = new ResponseEntity<>(e.getMessage().getBytes(), HttpStatus.EXPECTATION_FAILED);
            e.printStackTrace();
        }
        return  responseEntity;
    }

    // 根据浏览器的不同进行编码设置，返回编码后的文件名
    private String getFilename(HttpServletRequest request, String filename)  {
        // IE不同版本User-Agent中出现的关键词
        String[] IEBrowserKeyWords = {"MSIE", "Trident", "Edge"};
        // 获取请求头代理信息
        String userAgent = request.getHeader("User-Agent");
        String newFilename= null;
        try {
            for (String keyWord : IEBrowserKeyWords) {
                if (userAgent.contains(keyWord)) {
                    //IE内核浏览器，统一为UTF-8编码显示，并对转换的+进行更正
                    return URLEncoder.encode(filename, "UTF-8").replace("+"," ");
                }
            }
            newFilename = new String(filename.getBytes("UTF-8"), "ISO-8859-1");

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //火狐等其它浏览器统一为ISO-8859-1编码显示
        return newFilename;
    }
}