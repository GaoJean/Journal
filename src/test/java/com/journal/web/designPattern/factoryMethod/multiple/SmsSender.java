package com.journal.web.designPattern.factoryMethod.multiple;

public class SmsSender implements Sender {

	@Override
	public void Send() {

		System.out.println("this is smsSender.");
	}

}
