package com.journal.web.designPattern.abstractFactory;

public class SmsSender implements Sender {

	@Override
	public void Send() {

		System.out.println("this is smsSender.");
	}

}
