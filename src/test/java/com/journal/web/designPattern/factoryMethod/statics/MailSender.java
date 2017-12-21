package com.journal.web.designPattern.factoryMethod.statics;

public class MailSender implements Sender{

	@Override
	public void Send() {
		System.out.println("this is mailSender");
		
	}

}
