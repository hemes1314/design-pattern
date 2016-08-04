package org.keith.design_pattern.facade;


public class Realty1 implements Finance {

	public void buy() {
		System.out.println("房产买入");
	}

	public void sell() {
		System.out.println("房产卖出");
	}

}
