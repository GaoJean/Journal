package com.journal.web.designPattern.adaptor.interfaceAdaptor;

/**
 * 
 * 接口的适配器模式
 * 适配器模式将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造成的类的兼容性问题
 * 
 * 当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可
 * @author Jianjian
 *
 */
public class WrapperTest {
	public static void main(String[] args) {
		SourceAble sourceAble1 = new SourceSub1();
		SourceAble sourceAble2 = new SourceSub2();
		
		sourceAble1.method1();
		sourceAble1.method2();
		sourceAble2.method1();
		sourceAble2.method2();
	}
}
