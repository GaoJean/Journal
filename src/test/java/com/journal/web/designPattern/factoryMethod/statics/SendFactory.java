package com.journal.web.designPattern.factoryMethod.statics;


public class SendFactory {
	
	public static Sender mailSender(){
		return new MailSender();
	}
	
	public static Sender smsSender(){
		return new SmsSender();
	}

}
