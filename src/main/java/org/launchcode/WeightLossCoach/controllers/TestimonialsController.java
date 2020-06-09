package org.launchcode.WeightLossCoach.controllers;


import org.launchcode.WeightLossCoach.models.TestimonialClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestimonialsController {


    @GetMapping("testimonials")
    public String testimonialView(Model model) {
        model.addAttribute("title", "Testimonials");
        return "home/testimonials";
    }

    @GetMapping("testimonials/abbeyFronick")
    public String aFronickView(Model model){
        model.addAttribute("title", "Abbey Fronick");
        return "testimonials/abbeyFronick";
    }

    @GetMapping("testimonials/amandaVeninga")
    public String aVeningaView(Model model){
        model.addAttribute("title", "Amanda Veninga");
        return "testimonials/amandaVeninga";
    }

    @GetMapping("testimonials/christinaKennon")
    public String cKennonView(Model model){
        model.addAttribute("title", "Christina Kennon");
        return "testimonials/christinaKennon";
    }

    @GetMapping("testimonials/jessicaAebischer")
    public String jAebischerView(Model model){
        model.addAttribute("title", "Jessica Aebischer");
        return "testimonials/jessicaAebischer";
    }

    @GetMapping("testimonials/katieMoore")
    public String kMooreView(Model model){
        model.addAttribute("title", "Katie Moore");
        return "testimonials/katieMoore";
    }
}

