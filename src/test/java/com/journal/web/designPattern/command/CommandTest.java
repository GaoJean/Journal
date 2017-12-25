package com.journal.web.designPattern.command;

/**
 * 命令模式
 * 命令模式的目的就是达到命令的发出者和执行者之间解耦，实现请求和执行分开
 * @author Jianjian
 *
 */
public class CommandTest {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command = new MyCommand(receiver);
		
		Invoker invoker = new Invoker(command);
		invoker.action();
	}

}
