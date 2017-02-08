package org.om.design.pattern.command;

public class TvOffCommand implements Command
{
	private ElectronicDevice device;
	public TvOffCommand(ElectronicDevice device)
	{
		this.device = device;
	}
	
	public void execute()
	{
		device.off();
	}

}
