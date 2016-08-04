package org.keith.design_pattern.observer;


public class TongShi implements Observer {

	private String name;
	private Subject sub;
	
	public TongShi(String name, Subject sub) {
	
		this.name = name;
		this.sub = sub;
	}
	
	public void update() {
		System.out.println(sub.getActionMsg()+","+name+",别下车");
	}
}
