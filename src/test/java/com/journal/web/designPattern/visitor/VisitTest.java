package com.journal.web.designPattern.visitor;

/**
 * 访问者模式
 * 一种分离对象数据结构与行为的方法，通过这种分离，可达到为一个被访问者动态添加新的操作而无需做其它的修改的效果
 * 
 * 适用于数据结构相对稳定的系统，把数据结构和算法解耦
 * 
 * @author Jianjian
 *
 */
public class VisitTest {

	public static void main(String[] args) {
		Visitor visitor = new MyVisitor();
		Subject subject = new MySubject();
		
		subject.accept(visitor);
	}

}
