package com.example.Controller;
import com.example.Service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAppController {

    @Autowired
    ServiceWebApp serviceWebApp;
    @RequestMapping("/webapp")
    public String  sayHello(){
        return serviceWebApp.getMessage();
    }
}
