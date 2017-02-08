package org.om.design.pattern.command;

public class DeviceButton
{
	private Command command;

	public DeviceButton(Command command)
	{
		this.command = command;
	}
	
	public void press()
	{
		command.execute();
	}
}
