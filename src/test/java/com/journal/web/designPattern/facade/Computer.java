package com.journal.web.designPattern.facade;

public class Computer {

	private Cpu cpu;
	private Memory memory;
	private Disk disk;
	
	public Computer(){  
        cpu = new Cpu();  
        memory = new Memory();  
        disk = new Disk();  
    } 
	
	public void startup(){
		System.out.println("computer has start!");
		cpu.startup();
		memory.startup();
		disk.startup();
	}
	
	public void shutDown(){
		System.out.println("computer has shutDown");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
	}
}
