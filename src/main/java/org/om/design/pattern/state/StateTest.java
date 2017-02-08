package org.om.design.pattern.state;

public class StateTest
{
	public static void main(String[] args)
	{
		Computer computer = new Computer();
		computer.start();
		computer.sleep();
		computer.start();
		computer.restart();
		computer.shutDown();
		computer.start();
	}
}
