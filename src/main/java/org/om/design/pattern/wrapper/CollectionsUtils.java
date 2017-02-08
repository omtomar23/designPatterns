package org.om.design.pattern.wrapper;

public class CollectionsUtils 
{
	public static <E> CStack<E> createSynStack(CStack<E> stack)
	{
		return new SynStack<E>(stack);
	}
	
	public static class SynStack<E> implements CStack<E>
	{
		private CStack<E> stack;
		private Object mutex;
		
		public SynStack(CStack<E> stack)
		{
			this.stack = stack;
			mutex = new Object();
		}
		public void push(E element) 
		{
			synchronized (mutex) 
			{
				stack.push(element);
			}
		}

		public E pop() 
		{
			synchronized (mutex) 
			{
				return stack.pop();
			}
		}
		
		public boolean isFull()
		{
			synchronized (mutex) 
			{
				return stack.isFull();
			}
		}
		
		public boolean isEmpty()
		{
			synchronized (mutex) 
			{
				return stack.isEmpty();
			}
		}
	}
}
