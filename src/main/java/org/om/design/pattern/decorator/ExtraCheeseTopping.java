package org.om.design.pattern.decorator;

public class ExtraCheeseTopping extends	PizzaToppingsDecorator
{
	public ExtraCheeseTopping(Pizza pizza) 
	{
		super(pizza);
	}

	public double getPrice() 
	{
		return super.getPrice() + 3;
	}
}
