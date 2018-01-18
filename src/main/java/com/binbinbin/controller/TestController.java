package com.binbinbin.controller;

import com.binbinbin.entity.TestEntity;
import com.binbinbin.service.TestService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bin on 2018/1/15.
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;
    @ResponseBody
    @RequestMapping(value = "/")
    String home() {
        return "Hello World!";
    }
    @ResponseBody
    @RequestMapping(value = "/list")
    public PageInfo<TestEntity> list(){
        return testService.queryPageForList();
    }
}
