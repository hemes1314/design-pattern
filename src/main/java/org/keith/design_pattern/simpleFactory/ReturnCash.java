package org.keith.design_pattern.simpleFactory;


public class ReturnCash implements Cash {

	private double moneyCondation;
	
	private double monryReturn;
	
	public ReturnCash(double moneyCondation, double monryReturn) {
		this.moneyCondation = moneyCondation;
		this.monryReturn = monryReturn;
	}
	
	public double accept(double money) {
		
		return money - (money/moneyCondation)*monryReturn;
	}

}
