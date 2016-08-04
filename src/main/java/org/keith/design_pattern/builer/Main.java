package org.keith.design_pattern.builer;


public class Main {

	public static void main(String[] args) {
		Builder builder = new BuilderImpl1();
		new Director(builder);
		Product product = builder.getProduct();
		product.show();
	}
}
