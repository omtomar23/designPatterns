package org.om.design.pattern.command;

public class TvOnCommand implements Command
{
	private ElectronicDevice device;
	public TvOnCommand(ElectronicDevice device)
	{
		this.device = device;
	}
	
	public void execute()
	{
		device.on();
	}

}
