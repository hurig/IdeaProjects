package hu.intro.controllers;

import hu.intro.domain.Chair;
import hu.intro.services.ChairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChairController {

    @Autowired
    private ChairService service;

    @GetMapping("/chair")
    public String chair(Model model){
        Chair chair = service.getChair();
        model.addAttribute("oneChair", chair);
        return "chair";
    }

}
