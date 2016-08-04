package org.keith.design_pattern.broker;


public class Main {

	public static void main(String[] args) {
		
		Broker broker = new Zhongjie();
		ConcreateColleague1 c1 = new ConcreateColleague1();
		ConcreateColleague2 c2 = new ConcreateColleague2();
		
		// 互相认识下
		c1.setBroker(broker);
		c2.setBroker(broker);
		broker.setColleague1(c1);
		broker.setColleague2(c2);
		
		// 交互
		c1.send("吃饭了！");
		c2.send("走！");
	}
}
