package org.om.design.pattern.decorator;

public class DecoratorTest
{
	public static void main(String[] args)
	{
		Margherita pizza = new Margherita();
		System.out.println("Plain Margherita: "+ pizza.getPrice());
		
		ExtraCheeseTopping moreCheese = new ExtraCheeseTopping(pizza);
        ExtraCheeseTopping someMoreCheese = new ExtraCheeseTopping(moreCheese);
        System.out.println("Plain Margherita with double extra cheese: " + someMoreCheese.getPrice());
        
        MushroomTopping moreMushroom = new MushroomTopping(someMoreCheese);
        System.out.println("Plain Margherita with double extra cheese with mushroom: " + moreMushroom.getPrice());


	}
}