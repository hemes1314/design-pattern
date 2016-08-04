package org.keith.design_pattern.facade;


public class Stock3 implements Finance {

	public void buy() {
		System.out.println("股票3买入");
	}

	public void sell() {
		System.out.println("股票3卖出");
	}
}
