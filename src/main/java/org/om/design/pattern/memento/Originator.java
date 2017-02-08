package org.om.design.pattern.memento;

public class Originator 
{
	private String artical;
	
	public Memento storeInMemento()
	{
		return new Memento(artical);
	}
	
	public String storeFromMemento(Memento memento)
	{
		this.artical = memento.getArtical();
		return artical;
	}
	
	public void setArtical(String artical)
	{
		System.out.println("Current Originator: Current Version of Atrical\n"+ artical + "]n");
		this.artical = artical;
	}
	
	public String getArtical() 
	{
		return artical;
	}

	@Override
	public String toString() {
		return "Originator [artical=" + artical + "]";
	}
}
