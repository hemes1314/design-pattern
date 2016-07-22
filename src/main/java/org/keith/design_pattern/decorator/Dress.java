package org.keith.design_pattern.decorator;


public class Dress extends Person {

	private Person person;
	
	protected void decorate(Person person) {
		this.person = person;
	}
	
	public void show() {
		person.show();
	}
}
