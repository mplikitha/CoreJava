package com.stackroute.dependencyInversionPrinciple;
public class LightBulb implements SwitchOnorOff {
	@Override
	public void turnOn() {
		System.out.println("LightBulb: Bulb turned on");
	}
	@Override
	public void turnOff() {
		System.out.println("LightBulb: Bulb turned off");	
	}
	 public static void main(String []args) {
		 SwitchOnorOff obj=new LightBulb();
		
		 ElectricPowerSwitch obj2=new ElectricPowerSwitch();
		System.out.println(obj2.isOn());
		if( obj2.isOn()==true)
			obj.turnOn();
		else
			obj.turnOff();
		
	 }

}
