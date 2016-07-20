package org.keith.design_pattern.singleton;


public enum EnumSingleton {

	INSTANCE1("businessType1"),INSTANCE2("businessType2");
	
	private String businessType;
	
	private EnumSingleton(String businessType) { 
		this.businessType = businessType;
	}
	
	public void sendMsg(String msg) {
		System.out.println(businessType+"-Send Msg:"+msg);
	}
}
