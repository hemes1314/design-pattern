package org.keith.design_pattern.decorator;


public class Tie extends Dress {

	public void show() {
		System.out.println("穿上西裤");
		super.show();
	}
}
