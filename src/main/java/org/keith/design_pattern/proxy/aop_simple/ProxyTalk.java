package org.keith.design_pattern.proxy.aop_simple;


public class ProxyTalk implements ITalk {

	private ITalk talk;
	
	public ProxyTalk(ITalk talk) {
		this.talk = talk;
	}
	
	public void talk(String msg) {
		// 切面之前执行
        System.out.println("切面之前执行");
		talk.talk(msg);
		// 切面之后执行
        System.out.println("切面之后执行");
	}
}
