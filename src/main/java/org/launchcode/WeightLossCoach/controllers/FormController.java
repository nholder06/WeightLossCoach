package org.launchcode.WeightLossCoach.controllers;

import org.launchcode.WeightLossCoach.data.NewClientRepository;
import org.launchcode.WeightLossCoach.models.NewClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
@RequestMapping("/contact")
public class FormController {

    @Autowired
    private NewClientRepository newClientRepository;

    @GetMapping
    public String renderNewClientForm(Model model){
        model.addAttribute("title", "New Client Form");
        model.addAttribute(new NewClient());
        return "home/contact";
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public String processNewClientForm(@ModelAttribute @Valid NewClient newClient, Errors errors, Model model){
        System.out.println(errors.getFieldErrorCount());
        if(errors.hasErrors()){
            model.addAttribute("title", "New Client Form");
            model.addAttribute(new NewClient());
            return "home/contact";
        }else{
            System.out.println(newClient);
            newClientRepository.insert(newClient);
            return "home/success";
        }
    }
}