package hu.erdok.controllers;

import hu.erdok.services.FajtaService;
import hu.erdok.services.OrszagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private OrszagService orszagService;

    @Autowired
    public void setOrszagService(OrszagService orszagService) {
        this.orszagService = orszagService;
    }

    // dependency injection
    //  @Autowired
    private FajtaService fajtaService;

    @Autowired
    public void setFajtaService(FajtaService fajtaService) {
        this.fajtaService = fajtaService;
    }

//    public HomeController(FajtaService fajtaService) {
//        this.fajtaService = fajtaService;
//    }

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/orszagok")
    public String orszagok(Model model){
        model.addAttribute("orszagok", orszagService.getStaticOrszagList());
        return "orszagok";
    }
    @PostMapping("/orszag")
    public String orszag(@RequestParam(value = "orszagid") int id,  Model model){
        model.addAttribute("orszag", orszagService.getOrszagById(id));
        return "orszag";
    }

    @GetMapping("/fajtak")
    public String fajtak(Model model){
        model.addAttribute("fajtak", fajtaService.getStaticFajtaList());
        return "fajtak";
    }
    @GetMapping("/fajtak/{id}")
    public String fajtaById(@PathVariable(value="id") int identity, Model model){
        model.addAttribute("fajta", fajtaService.getFajtaById(identity));
        return "fajta";
    }

    @GetMapping("/erdok")
    public String erdok(){
        return "erdok";
    }
}
