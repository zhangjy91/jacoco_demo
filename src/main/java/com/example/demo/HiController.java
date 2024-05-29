package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HiController {
    @RequestMapping("hi")
    public String sayHi() {
        return "Hi!";
    }

    @RequestMapping("sheep")
    public String eatSheep(){return "very good";}
}
