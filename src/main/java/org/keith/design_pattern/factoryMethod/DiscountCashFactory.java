package org.keith.design_pattern.factoryMethod;

public class DiscountCashFactory implements CreateCashFactory {

	public Cash createCash() {
		return new DiscountCash(0.8);
	}
}
