package com.journal.web.designPattern.adaptor.objectAdaptor;

/**
 * 对象的适配器模式
 * 适配器模式将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造成的类的兼容性问题
 * 
 * 当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。
 * @author Jianjian
 *
 */
public class AdaptorTest {

	public static void main(String[] args) {
		Source source = new Source();
		Targetable targetable = new Wrapper(source);
		targetable.method1();
		targetable.method2();
	}
}
