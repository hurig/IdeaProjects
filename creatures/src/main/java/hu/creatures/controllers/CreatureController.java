package hu.creatures.controllers;

import hu.creatures.domain.Creature;
import hu.creatures.services.CreatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreatureController {

    @Autowired
    private CreatureService service;

    @GetMapping("/creature")
    public String creature(Model model){
        Creature creature = service.getCreature();
        model.addAttribute("fonix", creature);
        return "creature";
    }
    @GetMapping("/creatures")
    public String creatures(){
        return "creatures";
    }
}
