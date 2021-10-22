package hu.firstjason.controllers;

import hu.firstjason.domain.Pen;
import hu.firstjason.domain.Person;
import hu.firstjason.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private Service service;

    @GetMapping("/pens")
    @ResponseBody
    public List<Pen> pens(){
        return service.getPens();
    }

    @GetMapping("/people")
    @ResponseBody
    public List<Person> people(){
        return service.getPeople();
    }
}
