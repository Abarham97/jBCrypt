package com.Abarham97.jBCrypt;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String splash() {
        return "home";
    }

}
