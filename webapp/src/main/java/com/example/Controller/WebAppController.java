package com.example.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAppController {
    @RequestMapping("/webapp")
    @ResponseBody
    public String  sayHello(){
        return "Hello, World!";
    }
}
