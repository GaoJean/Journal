package com.journal.web.designPattern.factoryMethod.multiple;

public class SendFactory {

	public Sender mailSender(){
		return new MailSender();
	}
	
	public Sender smsSender(){
		return new SmsSender();
	}
	
}
