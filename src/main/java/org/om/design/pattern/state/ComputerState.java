package org.om.design.pattern.state;

public interface ComputerState 
{
	void start();
	void sleep();
	void shutDown();
	void hibernate();
	void restart();
	
}
