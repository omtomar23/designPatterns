package org.om.design.pattern.memento;

public class Memento {

	private String artical;

	public Memento(String text)
	{
		this.artical = text;
	}
	
	public String getArtical() 
	{
		return artical;
	}

	@Override
	public String toString() 
	{
		return "Memento [text=" + artical + "]";
	}
}
