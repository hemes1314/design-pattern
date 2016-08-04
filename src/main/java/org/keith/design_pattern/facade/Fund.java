package org.keith.design_pattern.facade;

/**
 * Facade-基金买卖
 *
 * @date 2016-7-19
 * @author keith
 */
public class Fund implements Finance {

	private Stock1 stock1;
	
	private Stock2 stock2;
	
	private Stock3 stock3;
	
	private NationalDebt1 nationalDebt1;
	
	private Realty1 realty1;
	
	public Fund() {
		
		stock1 = new Stock1();
		stock2 = new Stock2();
		stock3 = new Stock3();
		nationalDebt1 = new NationalDebt1();
		realty1 = new Realty1();
	}

	public void buy() {
		stock1.buy();
		stock2.buy();
		stock3.buy();
		nationalDebt1.buy();
		realty1.buy();
	}

	public void sell() {
		stock1.sell();
		stock2.sell();
		stock3.sell();
		nationalDebt1.sell();
		realty1.sell();
	}
}
