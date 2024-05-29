package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    @RequestMapping("daily")
    public String run() {
        return "run 100米!";
    }

    @RequestMapping("week")
    public String swim(){return "游泳1小时";}

    @RequestMapping("year")
    public String jump(){return "跳跃200次";}
}
