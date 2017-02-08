package org.om.design.pattern.memento;

public class TestMemento 
{
	private Caretacker caretacker;
	private Originator originator;
	int saveFiles = 0;
	int currentArtical = 0;
	private boolean undoEnable = false;
	private boolean redoEnable = false;
	
	public TestMemento()
	{
		caretacker = new Caretacker();
		originator = new Originator();
	}
	
	public void save(String artical)
	{
		originator.setArtical(artical);
		caretacker.addMemento(originator.storeInMemento());
		saveFiles++;
		currentArtical++;
		undoEnable = true;
	}
	
	public void undo()
	{
		if(undoEnable)
		{
			if(currentArtical >= 1)
			{
				currentArtical--;
				String artical = originator.storeFromMemento(caretacker.getMemento(currentArtical));
				setText(artical);
				redoEnable = true;
			}
			else
			{
				undoEnable = false;
			}
		}
	}
	
	public void redo()
	{
		if(redoEnable)
		{
			if( (saveFiles -1) > currentArtical)
			{
				currentArtical++;
				String artical = originator.storeFromMemento(caretacker.getMemento(currentArtical));
				setText(artical);
				undoEnable = true;
			}
			else
			{
				redoEnable = false;
			}
		}

	}
	
	public void setText(String text)
	{
		System.out.println(text);
	}
	
	public static void main(String[] args)
	{
		TestMemento memento = new TestMemento();
		memento.setText("Hi");
		memento.save("Hi");
		
		memento.setText("Hi Om");
		memento.save("Hi Om");
		
		memento.undo();
	}
}
