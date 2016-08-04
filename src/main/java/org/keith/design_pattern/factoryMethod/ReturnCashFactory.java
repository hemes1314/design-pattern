package org.keith.design_pattern.factoryMethod;


public class ReturnCashFactory implements CreateCashFactory {

	public Cash createCash() {
		return new ReturnCash(500, 10);
	}
}
