package org.keith.design_pattern.flyweight;


public class ConcreateWebsite implements Website {

	private String name;
	
	public ConcreateWebsite(String name) {
		this.name = name;
	}
	
	public void use() {
		System.out.println("建站："+name);
	}
}
