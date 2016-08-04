package org.keith.design_pattern.observer;

/**
 * 主题
 * 
 * @date 2016-7-19
 * @author keith
 */
public interface Subject {

	// 增加
	void addObserver(Observer observer);
	
	// 移除
	public void removeObserver(Observer observer);
	
	// 通知
	void inform();
	
	// 电话
	void setActionMsg(String msg);
	
	String getActionMsg();
}
