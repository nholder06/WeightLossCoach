package org.launchcode.WeightLossCoach.controllers;

import org.launchcode.WeightLossCoach.data.TestimonialClientRepository;
import org.launchcode.WeightLossCoach.models.TestimonialClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestimonialsController {

    @Autowired
    private TestimonialClientRepository testimonialClientRepository;

    List<TestimonialClient> testClients = new ArrayList();

    @GetMapping("/testimonials")
    public String testimonialView(Model model) {

        model.addAttribute("title", "Testimonials");
        TestimonialClient aFronick = new TestimonialClient("Abbey Fronick");
        TestimonialClient aVeninga = new TestimonialClient("Amanda Veninga");
        TestimonialClient cKennon = new TestimonialClient("Christina Kennon");
        TestimonialClient jAebischer = new TestimonialClient("Jessica Aebischer");
        TestimonialClient kMoore = new TestimonialClient("Katie Moore");
        TestimonialClient patty = new TestimonialClient("Patty");
        testClients.add(aFronick);
        testClients.add(aVeninga);
        testClients.add(cKennon);
        testClients.add(jAebischer);
        testClients.add(kMoore);
        testClients.add(patty);
//        testimonialClientRepository.save(aFronick);
//        testimonialClientRepository.save(aVeninga);
//        testimonialClientRepository.save(cKennon);
//        testimonialClientRepository.save(jAebischer);
//        testimonialClientRepository.save(kMoore);
//        testimonialClientRepository.save(patty);
//        model.addAttribute("testimonials", testimonialClientRepository.findAll());
        model.addAttribute("testClients", testClients);
        return "home/testimonials";
    }
}
