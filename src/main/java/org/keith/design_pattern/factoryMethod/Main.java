package org.keith.design_pattern.factoryMethod;


public class Main {

	public static void main(String[] args) {
		
		double price = 1000;
		
		CreateCashFactory factory = new ReturnCashFactory();
		Cash cash = factory.createCash();
		double money = cash.accept(price);
		System.out.println("PRICE:"+price+", CASH_TYPE:RETURN,MONEY:"+money);
	}
}
