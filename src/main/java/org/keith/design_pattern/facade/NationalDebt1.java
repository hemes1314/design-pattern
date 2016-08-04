package org.keith.design_pattern.facade;


public class NationalDebt1 implements Finance {

	public void buy() {
		System.out.println("国债买入");
	}

	public void sell() {
		System.out.println("国债卖出");
	}

}
