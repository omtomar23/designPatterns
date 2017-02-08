package org.om.design.pattern.decorator;

public class MushroomTopping extends PizzaToppingsDecorator
{
	public MushroomTopping(Pizza pizza)
	{
		super(pizza);
	}

	public double getPrice() 
	{
		return super.getPrice() + 1;
	}
}