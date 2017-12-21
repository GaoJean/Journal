package com.journal.web.designPattern.adaptor.classAdaptor;

public class Adaptor extends Source implements Targetable{

	@Override
	public void method2() {
		System.out.println("this is targetable  method!");
	}

}
