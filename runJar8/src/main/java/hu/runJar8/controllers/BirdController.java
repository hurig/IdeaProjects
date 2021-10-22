package hu.runJar8.controllers;

import hu.runJar8.services.BirdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BirdController {

    @Autowired
    private BirdService service;


}
