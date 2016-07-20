package org.keith.design_pattern.strategy;


public class CashContext {

	private Cash cash;
	
	public CashContext(String type) {
		
		switch (CashType.valueOf(type)) {
			
			case DISCOUNT:
				
				this.cash = new DiscountCash(0.8);
				break;
				
			case RETURN:
				
				this.cash = new ReturnCash(500, 10);
				break;
				
			default:
				
				this.cash = new NormalCash();
				break;
		}
	}
	
	public double getMoney(double money) {
		return this.cash.accept(money);
	}
}
