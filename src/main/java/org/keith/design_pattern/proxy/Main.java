package org.keith.design_pattern.proxy;


public class Main {

	public static void main(String[] args) {
		
		MM mm = new MM("如花");
		Proxy proxy = new Proxy(mm);
		
		proxy.giveDolls();
		proxy.giveFllowers();
		proxy.giveChocolates();
	}
}
