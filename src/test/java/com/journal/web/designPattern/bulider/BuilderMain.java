package com.journal.web.designPattern.bulider;

import java.util.List;

/**
 * 建造者模式
 * 建造者模式将很多功能集成到一个类里，这个类可以创造出比较复杂的东西。
 * 所以与工程模式的区别就是：工厂模式关注的是创建单个产品，而建造者模式则关注创建符合对象，多个部分。
 * @author Jianjian
 *
 */
public class BuilderMain {

	public static void main(String[] args) {
		Builder builder = new Builder();
		Builder builder2 = new Builder();
		builder2.produceSmsSender(3);
		builder.produceMailSender(4);
		List<Sender> senders = builder.getSenders();
		for (Sender sender : senders) {
			sender.Send();
		}
		List<Sender> senders2 = builder2.getSenders();
		for (Sender sender : senders2) {
			sender.Send();
		}
	}

}
