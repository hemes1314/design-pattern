package org.keith.design_pattern.singleton;


public enum EnumSingleton2 {

	INSTANCE1("businessType1"),INSTANCE2("businessType2");
	
	private String businessType;
	
	private EnumSingleton2(String businessType) { 
		this.businessType = businessType;
	}
	
	public void sendMsg(String msg) {
		System.out.println(businessType+"-Send Msg:"+msg);
	}
}
