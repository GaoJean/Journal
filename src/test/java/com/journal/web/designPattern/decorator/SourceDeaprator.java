package com.journal.web.designPattern.decorator;

public class SourceDeaprator implements Source {

	private Source source;

	public SourceDeaprator(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method() {
		System.out.println("before decorator!");  
        source.method();  
        System.out.println("after decorator!"); 
	}

}
