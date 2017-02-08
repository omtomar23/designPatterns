package org.om.design.pattern.command;

public class Television implements ElectronicDevice
{
	public void on()
	{
		System.out.println("TV is ON");
	}

	public void off()
	{
		System.out.println("TV is Off");		
	}

}
