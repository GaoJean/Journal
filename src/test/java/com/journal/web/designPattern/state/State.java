package com.journal.web.designPattern.state;

//状态类的核心类
public class State {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void method1() {
		System.out.println("execute the frist method!");
	}

	public void method2() {
		System.out.println("execute the second method!");
	}

}
