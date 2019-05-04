package com.example.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.email.model.Mail;
import com.example.email.service.MailService;

/**
 * Rest controller to send mail
 * @author Shilpi Das
 *
 */
@RestController
public class EmailController {
	@Autowired
	private MailService emailService;
	
	@PostMapping("/sendmail")
	public void sendMail(@RequestBody Mail mail) {
		emailService.sendSimpleMessage(mail);
		
	}

}
