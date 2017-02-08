package org.om.design.pattern.decorator.example1;

class WithSprinkles extends CoffeeDecorator
{
    public WithSprinkles(Coffee c) 
    {
        super(c);
    }

    public double getCost() 
    {
        return super.getCost() + 0.2;
    }

    public String getIngredients() 
    {
        return super.getIngredients() + ", Sprinkles";
    }
}