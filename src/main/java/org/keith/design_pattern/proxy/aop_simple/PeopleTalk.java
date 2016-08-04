package org.keith.design_pattern.proxy.aop_simple;


public class PeopleTalk implements ITalk {

	private String name;
	
	public PeopleTalk(String name) {
		this.name = name;
	}
	
	public void talk(String msg) {
		System.out.println("username:"+this.name+",talk:"+msg);
	}

}
