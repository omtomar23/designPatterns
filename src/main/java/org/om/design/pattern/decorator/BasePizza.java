package org.om.design.pattern.decorator;

public abstract class BasePizza implements Pizza
{
	protected double myPrice;
	
	public double getPrice()
	{
		return myPrice;
	}
}