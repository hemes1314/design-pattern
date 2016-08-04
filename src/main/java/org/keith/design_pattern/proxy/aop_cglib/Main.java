package org.keith.design_pattern.proxy.aop_cglib;

import org.keith.design_pattern.proxy.aop_cglib.PeopleTalk;

public class Main {

	public static void main(String[] args) {
		// 绑定代理，这种方式会在所有的方法都加上切面方法
		PeopleTalk peopleTalk = (PeopleTalk) new CglibProxy().getInstance(new PeopleTalk());
		peopleTalk.talk("业务说明");
	}
}
