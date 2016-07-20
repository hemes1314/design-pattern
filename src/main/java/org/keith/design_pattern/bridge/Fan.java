package org.keith.design_pattern.bridge;


public class Fan implements Equipment {

	public void powerOn() {
		System.out.println("开风扇");
	}

	public void powerOff() {
		System.out.println("关风扇");
	}

	
}
