package org.keith.design_pattern.bridge;


public class NormalSwitch extends Switch {

	// xml或注解的方式实现注入
	private Equipment equip;
	
	@Override
	public void on() {
		equip.powerOn();
	}
	
	@Override
	public void off() {
		equip.powerOff();
	}

	
	public Equipment getEquip() {
		return equip;
	}

	public void setEquip(Equipment equip) {
		this.equip = equip;
	}
}
