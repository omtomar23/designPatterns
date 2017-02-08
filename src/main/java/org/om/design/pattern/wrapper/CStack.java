package org.om.design.pattern.wrapper;

public interface CStack<E> 
{
	void push(E element);

	E pop();

	boolean isFull();

	boolean isEmpty();
}
