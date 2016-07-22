package org.keith.design_pattern.decorator;


public class Main {

	public static void main(String[] args) {
		
		Person person = new Person("小名");
		
		BigTrouser bigTrouser = new BigTrouser();
		Sneaker sneaker = new Sneaker();
		Tshirt tshirt = new Tshirt();
		
		tshirt.decorate(person);
		sneaker.decorate(tshirt);
		bigTrouser.decorate(sneaker);
		
		bigTrouser.show();
		
		Tie tie = new Tie();
		LeatherShoes leatherShoes = new LeatherShoes();
		Shirt shirt = new Shirt();
		
		shirt.decorate(person);
		leatherShoes.decorate(shirt);
		tie.decorate(leatherShoes);
		
		tie.show();
	}
}
