package com.journal.web.designPattern.bridge;

public class MyBridge extends Bridge{

	public void method(){
		getSourceable().method();
	}
}
