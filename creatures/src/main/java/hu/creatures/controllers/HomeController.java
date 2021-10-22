package hu.creatures.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // kéréskezelő metódusok  reguesthandling
    @GetMapping("/")
    public String home(){
        return "index";
    }

}
