package org.keith.design_pattern.factoryMethod;


public class NormalCashFactory implements CreateCashFactory {

	public Cash createCash() {
		return new NormalCash();
	}
}
