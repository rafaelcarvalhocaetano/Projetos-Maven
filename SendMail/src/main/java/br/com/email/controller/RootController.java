package br.com.email.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.email.model.SmtpSender;

@Controller
public class RootController {

	
	@Autowired
	private SmtpSender sender;
	
	@RequestMapping("/send")
	public String sendEmail() throws MessagingException {
		sender.sender("rapha.pse@outlook.com", "Teste spring", "Enviando mensagem de teste para o gmail");
		return "index";
		
	}
}
