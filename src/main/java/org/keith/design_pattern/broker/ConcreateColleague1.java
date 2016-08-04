package org.keith.design_pattern.broker;


public class ConcreateColleague1 implements Colleague {

	private Broker broker;
	
	public void send(String msg) {
		broker.send(msg, this);
	}

	public void inform(String msg) {
		System.out.println("同事1收到信息："+msg);
	}

	public Broker getBroker() {
		return broker;
	}
	
	public void setBroker(Broker broker) {
		this.broker = broker;
	}
}
