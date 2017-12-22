package com.journal.web.designPattern.bridge;

/**
 * 桥接模式
 * 桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。
 * 桥接的用意是：将抽象化与实现化解耦，使得二者可以独立变化
 * @author Jianjian
 *
 */
public class BridgeTest {
	public static void main(String[] args) {  
        
        Bridge bridge = new MyBridge();  
          
        /*调用第一个对象*/  
        Sourceable source1 = new SourceSub1();  
        bridge.setSourceable(source1);  
        bridge.method();  
          
        /*调用第二个对象*/  
        Sourceable source2 = new SourceSub2();  
        bridge.setSourceable(source2);  
        bridge.method();  
    }  
}
