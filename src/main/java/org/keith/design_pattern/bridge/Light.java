package org.keith.design_pattern.bridge;


public class Light implements Equipment {

	public void powerOn() {
		System.out.println("开灯");
	}

	public void powerOff() {
		System.out.println("关灯");
	}
}
