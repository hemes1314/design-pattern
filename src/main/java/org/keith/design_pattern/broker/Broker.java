package org.keith.design_pattern.broker;


public interface Broker {

	void send(String msg, Colleague colleague);
	
	void setColleague1(ConcreateColleague1 colleague1);
	
	void setColleague2(ConcreateColleague2 colleague1);
}
