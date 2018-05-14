package com.journal.web.designPattern.observer;

/**
 * 观察者模式，也可以称之为发布-订阅模式<br>
 * 当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化！
 * <br>
 * <br>
 * 应用场景： <br>
 *   1、 对一个对象状态的更新，需要其他对象同步更新，而且其他对象的数量动态可变。 <br>
 *   2、 对象仅需要将自己的更新通知给其他对象而不需要知道其他对象的细节。
 * @author Jianjian
 *
 */
public class ObserverTest {
	public static void main(String[] args) {
		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());

		sub.operation();
	}
}
