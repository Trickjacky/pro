package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    public static void main(String[] args) {
        System.out.println("测试专用");
    }

    public void aaa() {
        System.out.println("测试专用");

    }

    public void bbb() {
        System.out.println("测试专用");

    }
}
