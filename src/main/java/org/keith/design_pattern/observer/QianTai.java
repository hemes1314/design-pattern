package org.keith.design_pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class QianTai implements Subject {

	private List<Observer> tss = new ArrayList<Observer>();
	public String actionMsg;
	
	// 增加
	public void addObserver(Observer observer) {
		tss.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		tss.remove(observer);
	}
	
	// 通知
	public void inform() {
		for(Observer observer : tss) {
			observer.update();
		}
	}
	
	// 电话
	public void setActionMsg(String msg) {
		this.actionMsg = msg;
	}

	public String getActionMsg() {
		return this.actionMsg;
	}
}
