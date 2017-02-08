package org.om.design.pattern.command;

public class Client 
{
	public static void main(String[] args)
	{
		ElectronicDevice device = new Television();
		DeviceButton onButton = new DeviceButton(new TvOnCommand(device));
		DeviceButton offButton = new DeviceButton(new TvOffCommand(device));
		
		onButton.press();
		offButton.press();
	}
}
