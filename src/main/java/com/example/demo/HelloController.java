package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("hello")
    public String say() {
        return "Hello World!";
    }

    @RequestMapping("byebye")
    public String byebye() {
        return "byebye!";
    }

    @RequestMapping("basketball")
    public String basketball() {
        return "basketball";
    }

    @RequestMapping("football")
    public String footballPlayer() {
        return "梅西";
    }

    @RequestMapping("pingpang")
    public String pingpangstar() {
        return "pingpang，国球";
    }

    @RequestMapping("eat")
    public String eat() {
        return "eat";
    }


}
