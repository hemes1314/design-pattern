package org.keith.design_pattern.observer;

public class Main {

	public static void main(String[] args) {
	
		Subject qianTai = new QianTai();
		Observer ts = new TongShi("张三", qianTai);
		Observer ts2 = new TongShi("李四", qianTai);
		
		qianTai.addObserver(ts);
		qianTai.addObserver(ts2);
		qianTai.removeObserver(ts2);
		
		qianTai.setActionMsg("老虎来了");
		qianTai.inform();
		
	}
}
