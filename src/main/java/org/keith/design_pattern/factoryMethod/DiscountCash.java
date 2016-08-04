package org.keith.design_pattern.factoryMethod;


public class DiscountCash implements Cash {

	private double percent;
	
	public DiscountCash(double percent) {
		this.percent = percent;
	}
	
	public double accept(double money) {
		return money*percent;
	}

}
