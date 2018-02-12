package com.journal.web.designPattern.factoryMethod.abstractFactory;

public class SendSmsFactory implements Provider {

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
