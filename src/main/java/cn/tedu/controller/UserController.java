package cn.tedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "hello world";
    }
}
