package org.keith.design_pattern.singleton;


public class Main {

	public static void main(String[] args) {
		EnumSingleton2.INSTANCE1.sendMsg("come on1...");
		
		EnumSingleton2.INSTANCE2.sendMsg("come on2...");
		
		EnumSingleton2.INSTANCE1.sendMsg("come on1...");
	}
}
