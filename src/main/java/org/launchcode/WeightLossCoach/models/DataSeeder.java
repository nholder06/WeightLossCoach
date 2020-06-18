package org.launchcode.WeightLossCoach.models;


import org.launchcode.WeightLossCoach.data.NewClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public abstract class DataSeeder implements CommandLineRunner {

    private NewClientRepository newClientRepository;

    public DataSeeder(NewClientRepository newClientRepository){
        this.newClientRepository=newClientRepository;
    }
}
