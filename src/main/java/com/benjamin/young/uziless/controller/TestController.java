package com.benjamin.young.uziless.controller;

import com.benjamin.young.uziless.common.annotation.WebLog;
import com.benjamin.young.uziless.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class TestController {

    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    /**
     * POST 方式接口测试
     * @param user
     * @return
     */
    @PostMapping("/user/login")
    @WebLog(description = "请求了用户登录接口")
    public User userLogin(@RequestBody User user) {
        logger.info("user login ...");
        return user;
    }

    /**
     * GET 方式接口测试
     * @return
     */
    @GetMapping("/user/{id}")
    @WebLog(description = "请求了用户登录接口")
    public String findUserInfo(@PathVariable("id") String userId) {
        logger.info("find user info ...");
        return "success";
    }

    /**
     * GET 方式接口测试
     * @return
     */
    @GetMapping("/test")
    public String test() {
        logger.info("testGet ...");
        return "success";
    }

    /**
     * 单文件上传接口测试
     * @return
     */
    @PostMapping("/file/upload")
    public String testFileUpload(@RequestParam("file") MultipartFile file) {
        logger.info("testFileUpload ...");
        return "success";
    }

    /**
     * 多文件上传接口测试
     * @return
     */
    @PostMapping("/multiFile/upload")
    public String testMultiFileUpload(@RequestParam("file") MultipartFile[] file) {
        logger.info("testMultiFileUpload ...");
        return "success";
    }
}
