package org.keith.design_pattern.proxy;


public class GG implements GiveGift {

	private MM mm;
	
	public GG(MM mm) {
		this.mm = mm;
	}
	
	public void giveDolls() {
		System.out.println(mm.name+":送你洋娃娃。");
	}

	public void giveFllowers() {
		System.out.println(mm.name+":送你鲜花。");
	}

	public void giveChocolates() {
		System.out.println(mm.name+":送你巧克力。");
	}

	
}
