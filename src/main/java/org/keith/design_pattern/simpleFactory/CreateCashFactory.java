package org.keith.design_pattern.simpleFactory;


public class CreateCashFactory {

	public static Cash createCash(String type) {
		
		Cash cash = null;
		switch (CashType.valueOf(type)) {
			
			case DISCOUNT:
				
				cash = new DiscountCash(0.8);
				break;
				
			case RETURN:
				
				cash = new ReturnCash(500, 10);
				break;
				
			default:
				
				cash = new NormalCash();
				break;
		}
		return cash;
	}
}
