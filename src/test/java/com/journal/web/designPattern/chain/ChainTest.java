package com.journal.web.designPattern.chain;

/**
 * 责任链模式
 * 
 * 在一个时刻，命令只允许由一个对象传给另一个对象，而不允许传给多个对象
 * 链接上的请求可以是一条链，可以是一个树，还可以是一个环
 * @author Jianjian
 *
 */
public class ChainTest {

	public static void main(String[] args) {
		MyHandler handler1 = new MyHandler("A");
		MyHandler handler2 = new MyHandler("B");
		MyHandler handler3 = new MyHandler("C");

		handler1.setHandler(handler2);
		handler2.setHandler(handler3);
		
		handler1.operator();
	}

}
