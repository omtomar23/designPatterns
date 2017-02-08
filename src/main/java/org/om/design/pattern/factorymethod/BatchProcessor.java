package org.om.design.pattern.factorymethod;

import java.io.File;

public abstract class BatchProcessor 
{
	public void processBatch(File file)
	{
		Parser parser = createParser(file);
		parser.parse();
	}
	
	public abstract Parser createParser(File file);
}
