package com.stackroute.dependencyInversionPrinciple;

public  class ElectricPowerSwitch implements Switch {
	public SwitchOnorOff person;
    public boolean on;
    public  ElectricPowerSwitch() {
        this.person = person;
        this.on = true;
        //this.on = false;
    }
    public boolean isOn() {
        return this.on;
    }
   public  void press(){
       boolean checkOn = isOn();
       if (checkOn) {
           person.turnOff();
           this.on = false;
       } else {
             person.turnOn();
             this.on = true;
       }
 
   }
  
}
