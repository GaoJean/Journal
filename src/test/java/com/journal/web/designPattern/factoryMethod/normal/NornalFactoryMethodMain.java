package com.journal.web.designPattern.factoryMethod.normal;


/**
 * 普通工厂模式
 * 就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 * @author Jianjian
 *
 */
public class NornalFactoryMethodMain {

	public static void main(String[] args){
		SendFactory sendFactory = new SendFactory();
		Sender sender = sendFactory.produce("sms");
		sender.Send();
	}
	
}
