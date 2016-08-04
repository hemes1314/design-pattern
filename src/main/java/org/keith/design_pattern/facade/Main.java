package org.keith.design_pattern.facade;


public class Main {

	public static void main(String[] args) {
		Fund facade = new Fund();
		facade.buy();
		facade.sell();
	}
}
