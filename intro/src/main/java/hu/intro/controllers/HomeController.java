package hu.intro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "index";
    }
    @GetMapping("/link")
    public String link(){
        return "link";
    }
}
