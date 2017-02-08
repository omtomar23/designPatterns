package org.om.design.pattern.decorator.example1;

public class SimpleCoffee implements Coffee 
{
    public double getCost()
    {
        return 1;
    }

    public String getIngredients()
    {
        return "Coffee";
    }
}