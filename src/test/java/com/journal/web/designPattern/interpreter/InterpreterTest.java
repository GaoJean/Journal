package com.journal.web.designPattern.interpreter;

/**
 * 解释器模式
 * @author Jianjian
 *
 */
public class InterpreterTest {
	public static void main(String[] args) {

		// 计算9+2-8的值
		int result = new Minus().interpret((new Context(new Plus()
				.interpret(new Context(9, 2)), 8)));
		System.out.println(result);
	}
}
