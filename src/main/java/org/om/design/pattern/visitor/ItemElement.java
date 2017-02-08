package org.om.design.pattern.visitor;

public interface ItemElement
{
	public int accept(ShoppingCartVisitor visitor);
}