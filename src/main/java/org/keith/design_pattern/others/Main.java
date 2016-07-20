package org.keith.design_pattern.others;


public class Main {

	public static void main(String[] args) {
		
		String key = "FAN";
		
		switch (EquipmentEnum.valueOf(key)) {
			case LIGHT:
				
				System.out.println("电灯泡");
				break;
				
			case FAN:
				
				System.out.println("风扇");
				break;


			default:
				break;
		}
	}
}
