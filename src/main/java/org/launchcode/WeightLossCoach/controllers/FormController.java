package org.launchcode.WeightLossCoach.controllers;

import org.launchcode.WeightLossCoach.data.NewClientRepository;
import org.launchcode.WeightLossCoach.models.NewClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("new")
public class FormController {

    @Autowired
    private NewClientRepository newClientRepository;

    @GetMapping
    public String renderNewClientForm(Model model){
        model.addAttribute("title", "Start Your Journey Today");
        model.addAttribute(new NewClient());
        return "main/contactform";
    }
    @PostMapping
    public String processNewClientForm(@ModelAttribute @Valid NewClient newClient, Errors errors, Model model){
        if(errors.hasErrors()){
            model.addAttribute("title", "Start Your Journey Today");
            return "main/contactform";
        }else{
            newClientRepository.save(newClient);
            return "index";
        }
    }
}
