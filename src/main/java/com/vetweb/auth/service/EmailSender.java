package com.vetweb.auth.service;

import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@ApplicationScoped
public class EmailSender {
	
	@Resource(mappedName = "java:jboss/mail/gmail")
	private Session session;
	
	public void send(String remetente, String destinatario, String assunto, String mensagem) {
		MimeMessage message = new MimeMessage(session);
		try {
			message.setRecipients(RecipientType.TO, InternetAddress.parse(destinatario));;
			message.setFrom(remetente);
			message.setSubject(assunto);
			message.setContent(mensagem, "text/html");
			Transport.send(message);
		} catch (MessagingException messagingException) {
			throw new RuntimeException(messagingException);
		}
	}
	
}
