package org.keith.design_pattern.bridge;


public class FancySwitch extends Switch {

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
