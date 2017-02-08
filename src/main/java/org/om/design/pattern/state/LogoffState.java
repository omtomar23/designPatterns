package org.om.design.pattern.state;

public class LogoffState implements ComputerState {

	private Computer computer;

	public LogoffState(Computer computer)
	{
		this.computer = computer;
	}

	public void start() 
	{
		System.out.println("Going to start state");
		computer.setComputerState(computer.getStartState());
	}

	public void sleep() 
	{
		System.out.println("Can't go to sleep state");
	}

	public void shutDown() 
	{
		System.out.println("Going to shutDown state");
		computer.setComputerState(computer.getStartState());
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
