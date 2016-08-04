package org.keith.design_pattern.proxy.aop_simple;


public class Main {

	public static void main(String[] args) {
		
		ProxyTalk proxyTalk = new ProxyTalk(new PeopleTalk("GG"));
		proxyTalk.talk("MXMX");
	}
}
