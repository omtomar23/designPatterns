package org.om.design.pattern.wrapper;

public class Test 
{
	public static void main(String[] args) 
	{
		CStack<Integer> stack = new CStackIml<Integer>(3);
		CStack<Integer> synStack = CollectionsUtils.createSynStack(stack);
		synStack.push(2);
	}
}
