package org.om.design.pattern.state;

public class SleepState implements ComputerState
{
	private Computer computer;

	public SleepState(Computer computer)
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
		System.out.println("Alreay in sleep state.");
	}

	public void shutDown()
	{
		System.out.println("Going to shutdown state");
		computer.setComputerState(computer.getShutDownState());
	}

	public void hibernate()
	{
		System.out.println("Going to hibernate state");
		computer.setComputerState(computer.getHibernetState());		
	}

	public void restart()
	{
		System.out.println("Going to restart state");
		computer.setComputerState(computer.getRestartState());				
	}

}
