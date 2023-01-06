package com.command.pattern;

public class Test {

	public static void main(String[] args) {
		
		Light light=new Light();
		Command lightOn=new LightOnCommand(light);
		RemoteControl onButton=new RemoteControl(lightOn);
		onButton.buttonPress();
		
		Light light1=new Light();
		Command lightOff=new LightOffCommand(light1);
		RemoteControl offButton=new RemoteControl(lightOff);
		offButton.buttonPress();


	}

}
