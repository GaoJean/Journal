package com.journal.web.designPattern.state;

/**
 * 状态模式
 * 当对象的状态改变时，同时改变其行为
 * 
 * @author Jianjian
 *
 */
public class StateTest {

	public static void main(String[] args) {
		State state = new State();
		Context context = new Context(state);
		
		state.setValue("state1");
		context.method();
		
		state.setValue("state2");
		context.method();
		
		state.setValue("state3s");
		context.method();
	}

}
