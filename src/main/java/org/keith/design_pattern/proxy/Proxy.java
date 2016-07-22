package org.keith.design_pattern.proxy;


public class Proxy implements GiveGift {

	private Pursuer pursuer;
	
	public Proxy(MM mm){
		this.pursuer = new Pursuer(mm);
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
