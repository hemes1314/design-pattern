package org.keith.design_pattern.builer;


public class BuilderImpl2 implements Builder {

	private Product product = new Product();
	
	public void addPart1() {
		product.addPart("部件X;");
	}

	public void addPart2() {
		product.addPart("部件Y;");
	}

	public void addPart3() {
		product.addPart("部件Z;");
	}

	public Product getProduct() {
		return product;
	}

}
