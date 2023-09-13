package com.Abarham97.jBCrypt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppllController {

    @GetMapping ("/App")
        public String AppHome()
        {

            return "/APP";
        }
}
