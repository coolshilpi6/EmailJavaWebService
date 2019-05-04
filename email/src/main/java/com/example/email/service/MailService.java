package com.example.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.email.model.Mail;

/**
 * Service class to send mail using JavaMailSender
 * @author Shilpi Das
 *
 */
@Service
public class MailService {

    @Autowired
    private JavaMailSender emailSender;

    public void sendSimpleMessage(final Mail mail){
        SimpleMailMessage message = new SimpleMailMessage();
        StringBuilder content = new StringBuilder();
        content.append("Dear ");
        content.append(mail.getUserName());
        content.append(", \n");
        content.append(mail.getContent());
        content.append("\n\nRegards\n");
        content.append("Company Name");
        message.setSubject(mail.getSubject());
        message.setText(content.toString());
        message.setTo(mail.getEmailAddress());
        message.setFrom("<Your Mail>");
        emailSender.send(message);
    }

}
