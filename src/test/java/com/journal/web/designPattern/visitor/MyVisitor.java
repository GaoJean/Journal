package com.journal.web.designPattern.visitor;

public class MyVisitor implements Visitor {

	@Override
	public void visit(Subject subject) {
		System.out.println("Visit the Subject " + subject.getSubject());
	}

}
