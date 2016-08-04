package org.keith.design_pattern.proxy;


public class Proxy implements GiveGift {

	private GG pursuer;
	
	public Proxy(MM mm){
		this.pursuer = new GG(mm);
	}
	
	public void giveDolls() {
		this.pursuer.giveDolls();
	}

	public void giveFllowers() {
		this.pursuer.giveFllowers();
	}

	public void giveChocolates() {
		this.pursuer.giveChocolates();
	}

}
