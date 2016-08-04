package org.keith.design_pattern.builer;


public class BuilderImpl1 implements Builder {

	private Product product = new Product();
	
	public void addPart1() {
		product.addPart("部件A;");
	}

	public void addPart2() {
		product.addPart("部件B;");
	}

	public void addPart3() {
		product.addPart("部件C;");
	}

	public Product getProduct() {
		return product;
	}

}
