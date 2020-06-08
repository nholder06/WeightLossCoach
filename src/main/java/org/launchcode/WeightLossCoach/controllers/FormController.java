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

import javax.validation.Valid;

@Controller
public class FormController {

    @Autowired
    private NewClientRepository newClientRepository;

    @GetMapping("/contactform")
    public String renderNewClientForm(Model model){
        model.addAttribute("title", "Start Your Journey Today");
        model.addAttribute(new NewClient());
        return "home/contactform";
    }

    @PostMapping("contactform")
    public String processNewClientForm(@ModelAttribute @Valid NewClient newClient, Errors errors, Model model){
        if(errors.hasErrors()){
            model.addAttribute("title", "New Client Form");
            return "redirect:";
        }else{
            newClientRepository.save(newClient);
            return "home/contactform";
        }
    }
}