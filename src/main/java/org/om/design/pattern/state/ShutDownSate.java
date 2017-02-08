package org.om.design.pattern.state;

public class ShutDownSate implements ComputerState
{
	private Computer computer;

	public ShutDownSate(Computer computer)
	{
		this.computer = computer;
	}
	
	public void start()
	{
		System.out.println("Start Computer");
		computer.setComputerState(computer.getStartState());
	}

	public void sleep() 
	{
		System.out.println("Can't go to sleep state");
	}

	public void shutDown()
	{
		System.out.println("Already shutdown.");
	}

	public void hibernate()
	{
		System.out.println("Can't go to hibernate state");
	}

	public void restart() 
	{
		System.out.println("Can't go to restart state");
	}
}
