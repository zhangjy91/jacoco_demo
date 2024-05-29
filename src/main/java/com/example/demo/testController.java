package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class testController {
    @RequestMapping("testAdd")
    public String add() {
        return "2";
    }

    @RequestMapping("testmulti")
    public String multi(){return "4";}
}
