package org.keith.design_pattern.decorator;


public class Person {

	private String name;
	
	public Person() {}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println(name+"试衣完成，完美！");
	}
}
