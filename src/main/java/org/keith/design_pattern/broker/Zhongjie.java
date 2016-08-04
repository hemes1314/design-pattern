package org.keith.design_pattern.broker;

public class Zhongjie implements Broker {

	private ConcreateColleague1 colleague1;
	
	private ConcreateColleague2 colleague2;
	
	public void send(String msg, Colleague colleague) {
		
		if(colleague instanceof ConcreateColleague1) {
			
			colleague2.inform(msg);
		} else if(colleague instanceof ConcreateColleague2) {
			colleague1.inform(msg);
		}
	}
	
	public void setColleague1(ConcreateColleague1 colleague1) {
		this.colleague1 = colleague1;
	}

	public void setColleague2(ConcreateColleague2 colleague2) {
		this.colleague2 = colleague2;
	}
}
