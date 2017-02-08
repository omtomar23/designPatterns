package org.om.design.pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretacker 
{
	private List<Memento> savedArticals;
	
	public Caretacker()
	{
		this.savedArticals = new ArrayList<Memento>();
	}
	
	public void addMemento(Memento memento)
	{
		savedArticals.add(memento);
	}
	
	public Memento getMemento(int index)
	{
		return savedArticals.get(index);
	}
}
