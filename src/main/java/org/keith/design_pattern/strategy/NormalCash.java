package org.keith.design_pattern.strategy;


public class NormalCash implements Cash {

	public double accept(double money) {
		return money;
	}

}
