package com.journal.web.thread;

//建立三个线程，A线程打印10次A，B线程打印10次B,C线程打印10次C，要求线程同时运行，交替打印10次ABC。
public class MyThreadPrinter implements Runnable {
	private String name;
	private Object prev;
	private Object self;

	// prev/self 均为对象锁
	private MyThreadPrinter(String name, Object prev, Object self) {
		this.name = name;
		this.prev = prev;
		this.self = self;
	}

	public void run() {
		int count = 10;
		while (count > 0) {
			synchronized (prev) {
				synchronized (self) {
					System.out.print(name);
					count--;

					self.notify();//notify()就是对对象锁的唤醒操作  释放自身对象锁，唤醒下一个等待线程
				}
				try {
					prev.wait();//wait()就是说线程在获取对象锁后，主动释放对象锁，同时本线程休眠
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		Object a = new Object();
		Object b = new Object();
		Object c = new Object();
		MyThreadPrinter pa = new MyThreadPrinter("A", c, a);
		MyThreadPrinter pb = new MyThreadPrinter("B", a, b);
		MyThreadPrinter pc = new MyThreadPrinter("C", b, c);

		new Thread(pa).start();
		Thread.sleep(100); // 确保按顺序A、B、C执行   sleep()睡眠时，保持对象锁，仍然占有该锁；而wait()睡眠时，释放对象锁。
		new Thread(pb).start();
		Thread.sleep(100);
		new Thread(pc).start();
		Thread.sleep(100);
	}

}
