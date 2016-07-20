package org.keith.design_pattern.simpleFactory;


public class Main {

	private static String CASH_TYPE_RETURN = "RETURN";
	
	public static void main(String[] args) {
		
		String type = CASH_TYPE_RETURN;
		double price = 1000;
		
		Cash cash = CreateCashFactory.createCash(type);
		double money = cash.accept(price);
		System.out.println("PRICE:"+price+", CASH_TYPE:"+type+",MONEY:"+money);
	}
}
