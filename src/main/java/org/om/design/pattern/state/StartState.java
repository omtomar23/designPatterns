package org.om.design.pattern.state;

public class StartState implements ComputerState {

	private Computer computer;

	public StartState(Computer computer) {
		this.computer = computer;
	}

	public void start() 
	{
		System.out.println("Alreay Started.");
	}

	public void sleep() 
	{
		System.out.println("Going to sleep state.");
		computer.setComputerState(computer.getSleepState());
	}

	public void shutDown()
	{
		System.out.println("Going to shutdown state.");
		computer.setComputerState(computer.getShutDownState());
	}

	public void hibernate() 
	{
		System.out.println("Going to hibernate state.");
		computer.setComputerState(computer.getHibernetState());
	}

	public void restart()
	{
		System.out.println("Going to restart");
		computer.setComputerState(computer.getRestartState());
	}

}
