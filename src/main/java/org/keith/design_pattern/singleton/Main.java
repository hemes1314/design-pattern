package org.keith.design_pattern.singleton;


public class Main {

	public static void main(String[] args) {
		EnumSingleton.INSTANCE1.sendMsg("come on1...");
		
		EnumSingleton.INSTANCE2.sendMsg("come on2...");
		
		EnumSingleton.INSTANCE1.sendMsg("come on1...");
	}
}
