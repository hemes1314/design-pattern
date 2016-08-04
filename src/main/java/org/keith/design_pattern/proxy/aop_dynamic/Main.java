package org.keith.design_pattern.proxy.aop_dynamic;


public class Main {

	public static void main(String[] args) {
		
		// 绑定代理，这种方式会在所有的方法都加上切面方法
        ITalk iTalk = (ITalk) new DynamicProxy().bind(new PeopleTalk("MM"));
        iTalk.talk("业务说明");
	}
}
