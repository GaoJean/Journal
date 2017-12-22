package com.journal.web.designPattern.bridge;

public class SourceSub1 implements Sourceable{

	@Override
	public void method() {
		System.out.println("this is first sub");
	}

}
