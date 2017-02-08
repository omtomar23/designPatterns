package org.om.design.pattern.decorator;

public abstract class PizzaToppingsDecorator implements Pizza
{
	protected Pizza pizza;

	public PizzaToppingsDecorator(Pizza pizza)
	{
		this.pizza = pizza;
	}

	public double getPrice() 
	{
		return pizza.getPrice();
	}
}