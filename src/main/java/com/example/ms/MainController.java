package com.example.ms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/ms")
    public String index(){
        return "index";
    }
}
