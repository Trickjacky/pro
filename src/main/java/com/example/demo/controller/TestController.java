package com.example.demo.controller;

import com.example.demo.bean.Test;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    public static void main(String[] args) {
        System.out.println("测试专用");
        System.out.println(10%3);
    }

    public void aaa() {
        System.out.println("测试专用");
        Test test=new Test();
        test.setAaa("a");
    }

    public void bbb() {
        System.out.println("测试专用");

    }
}
