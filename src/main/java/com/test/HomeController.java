package com.test;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HomeController {
    @RequestMapping ("/mainIndex")
    private String showHomePage (){
        return "mainIndex";
    }
    @RequestMapping (value = "/outPage", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    private String showOutPage(ModelMap model){
        String m = "John";
        model.addAttribute("message", m);
        return "outPage";
    }
    @RequestMapping (value = "/outH", method = RequestMethod.GET)
    @ResponseStatus (HttpStatus.OK)
    private String showOutH (ModelMap model){
        String h = "This is HTML list";
        model.addAttribute("message", h);
        return "outH";
    }
}
