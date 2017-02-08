package org.om.design.pattern.decorator.example1;

public abstract class CoffeeDecorator implements Coffee 
{
    protected final Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee c) 
    {
        this.decoratedCoffee = c;
    }

    public double getCost()
    { 
        return decoratedCoffee.getCost();
    }

    public String getIngredients() 
    {
        return decoratedCoffee.getIngredients();
    }
}
