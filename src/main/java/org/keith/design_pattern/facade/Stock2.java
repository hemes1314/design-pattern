package org.keith.design_pattern.facade;


public class Stock2 implements Finance {

	public void buy() {
		System.out.println("股票2买入");
	}

	public void sell() {
		System.out.println("股票2卖出");
	}
}
