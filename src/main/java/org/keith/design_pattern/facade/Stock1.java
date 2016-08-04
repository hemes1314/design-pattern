package org.keith.design_pattern.facade;


public class Stock1 implements Finance {

	public void buy() {
		System.out.println("股票1买入");
	}

	public void sell() {
		System.out.println("股票1卖出");
	}
}
