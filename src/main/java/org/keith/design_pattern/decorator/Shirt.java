package org.keith.design_pattern.decorator;


public class Shirt extends Dress {

	public void show() {
		System.out.println("穿上衬衣");
		super.show();
	}
}
