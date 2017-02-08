package org.om.design.pattern.wrapper;

public class CStackIml<E> implements CStack<E>
{
	private Object[] elements;
	private int capacity;
	private int count = 0;
	public CStackIml(int capacity)
	{
		this.capacity = capacity;
		elements = new Object[capacity];
	}
	
	public void push(E element) 
	{
		if(element == null)
		{
			throw new IllegalArgumentException("Element must not be null.");
		}
		if(isFull())
		{
			throw new RuntimeException("Stack has been full.");
		}
		
		elements[count++] = element;
	}

	public E pop() 
	{
		if(isEmpty())
		{
			throw new RuntimeException("Stack has been emptys.");
		}
		
		@SuppressWarnings("unchecked")
		E element = (E)elements[count];
		elements[count--] = null;
		return element;
	}
	
	public boolean isFull()
	{
		return count >= capacity;
	}
	
	public boolean isEmpty()
	{
		return count == 0;
	}
}
