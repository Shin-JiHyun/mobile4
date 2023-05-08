package com.example.mobile4.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @PostMapping(value = "/signup")
    @ResponseBody
    public String androidResponse(@RequestBody UserData user) {
        System.out.println("Connection from Android");
        System.out.println("Id: "+user.getId()+",  pw: "+user.getPw());

        return "1";

    }
}
