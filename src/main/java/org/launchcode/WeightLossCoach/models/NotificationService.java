package org.launchcode.WeightLossCoach.models;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private JavaMailSender javaMailSender;

    @Autowired
    public NotificationService(JavaMailSender javaMailSender){
        this.javaMailSender = javaMailSender;
    }

    public void SendNotification(NewClient newClient) throws MailException {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(newClient.getEmail());
        mail.setFrom("nholder06@gmail.com");
        mail.setSubject("Potential Client requesting more information");
        mail.setText("Name: " + newClient.getFirstName() + " " + newClient.getLastName() +
                "\n Email: " + newClient.getEmail() + "\n Description of wight loss goals: " +
                newClient.getBriefDescription());

        javaMailSender.send(mail);
    }
}
