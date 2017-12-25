package com.journal.web.designPattern.chain;

public class MyHandler extends AbstractHandler implements Handler {

	private String name;

	public MyHandler(String name) {
		this.name = name;
	}

	@Override
	public void operator() {
		System.out.println("Myhandler: " + name);
		if (getHandler() != null) {
			getHandler().operator();
		}

	}

}
