package com.journal.web.designPattern.factoryMethod.statics;

public class SmsSender implements Sender {

	@Override
	public void Send() {

		System.out.println("this is smsSender.");
	}

}
