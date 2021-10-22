package hu.runJar8.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FrontController {

    // RequestHandler method
    @RequestMapping(method= RequestMethod.GET, path="/")
    public String front(){
        return "frontpage";
    }

}
