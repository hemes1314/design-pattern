package org.keith.design_pattern.strategy;


public class Main {

	private static String CASH_TYPE_RETURN = "RETURN";
	
	public static void main(String[] args) {
		
		String type = CASH_TYPE_RETURN;
		double price = 1000;
		
		// 工厂模式需认识两个类，Cash和CashFactory，而策略模式只需认识一个，减少耦合
		CashContext context = new CashContext(type);
		double money = context.getMoney(price);
		System.out.println("PRICE:"+price+", CASH_TYPE:"+type+",MONEY:"+money);
	}
}
