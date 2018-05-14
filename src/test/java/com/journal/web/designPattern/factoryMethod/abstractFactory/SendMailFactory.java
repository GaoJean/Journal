package com.journal.web.designPattern.factoryMethod.abstractFactory;

public class SendMailFactory implements Provider{

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
