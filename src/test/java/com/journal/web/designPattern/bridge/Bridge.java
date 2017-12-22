package com.journal.web.designPattern.bridge;

public abstract class Bridge {

	private Sourceable sourceable;
	
	public void method(){
		sourceable.method();
	}
	
	public void setSourceable(Sourceable sourceable) {
		this.sourceable = sourceable;
	}
	
	public Sourceable getSourceable() {
		return sourceable;
	}
}
