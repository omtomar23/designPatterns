package org.om.design.pattern.state;

public class RestartState implements ComputerState {

	private Computer computer;

	public RestartState(Computer computer)
	{
		this.computer = computer;
	}

	public void start() 
	{
		System.out.println("Going to start state.");
		computer.setComputerState(computer.getSleepState());
	}

	public void sleep() 
	{
		System.out.println("Can't go to sleep state");
	}

	public void shutDown() 
	{
		System.out.println("Can't go to shutDown state");
	}

	public void hibernate() 
	{
		System.out.println("Can't go to hibernate state");
	}

	public void restart() 
	{
		System.out.println("Alreay in start state.");
	}

}
