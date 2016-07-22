package org.keith.design_pattern.decorator;


public class Tshirt extends Dress {

	public void show() {
		System.out.println("穿上T恤,");
		super.show();
	}
}
