package com.journal.web.designPattern.factoryMethod.multiple;


/**
 * 多个工厂方法模式
 * 是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象
 * @author Jianjian
 *
 */
public class MultipleFactoryMethodMain {

	public static void main(String[] args){
		SendFactory sendFactory = new SendFactory();
		Sender sender = sendFactory.mailSender();
		sender.Send();
	}
	
}
