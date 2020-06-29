package org.launchcode.WeightLossCoach.controllers;

import org.launchcode.WeightLossCoach.data.NewClientRepository;
import org.launchcode.WeightLossCoach.models.NewClient;
import org.launchcode.WeightLossCoach.models.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@Controller
@RequestMapping("contact")
public class FormController {

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private NewClientRepository newClientRepository;

    @GetMapping
    public String renderNewClientForm(Model model){
        model.addAttribute("title", "New Client Form");
        model.addAttribute("newClient", new NewClient());
        return "home/contact";
    }

    @PostMapping
    public String processNewClientForm(@ModelAttribute @Valid NewClient newClient,
                                       Errors errors, Model model) {
        if(errors.hasErrors()) {
            model.addAttribute("title", "New Client Form");
            return "home/contact";
        }else{
            newClientRepository.save(newClient);
            notificationService.SendNotification(newClient);
        }return "home/success";
    }
}