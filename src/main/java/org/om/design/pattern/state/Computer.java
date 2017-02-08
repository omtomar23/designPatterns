package org.om.design.pattern.state;

public class Computer 
{
	private ComputerState computerState;
	
	private ComputerState shutDownState;
	private ComputerState sleepState;
	private ComputerState hibernetState;
	private ComputerState logoffState;
	private ComputerState restartState;
	private ComputerState startState;
	
	public Computer()
	{
		shutDownState = new ShutDownSate(this);
		sleepState = new SleepState(this);
		hibernetState = new HibernetState(this);
		logoffState = new LogoffState(this);
		restartState = new RestartState(this);
		startState = new StartState(this);
		computerState = shutDownState;
	}

	public void start() 
	{
		computerState.start();
	}

	public void sleep()
	{
		computerState.sleep();
	}

	public void shutDown()
	{
		computerState.shutDown();
	}

	public void hibernate()
	{
		computerState.hibernate();
	}

	public void restart()
	{
		computerState.restart();	
	}
	
	public ComputerState getComputerState() {
		return computerState;
	}

	public ComputerState getShutDownState() {
		return shutDownState;
	}

	public ComputerState getSleepState() {
		return sleepState;
	}

	public ComputerState getHibernetState() {
		return hibernetState;
	}

	public ComputerState getLogoffState() {
		return logoffState;
	}

	public ComputerState getRestartState() {
		return restartState;
	}

	public ComputerState getStartState() {
		return startState;
	}

	public void setComputerState(ComputerState computerState) {
		this.computerState = computerState;
	}
}
