package org.launchcode.WeightLossCoach.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("new")
public class FormController {

    @GetMapping
    public String renderNewClientForm(){
        return "main/contactform";
    }
}
