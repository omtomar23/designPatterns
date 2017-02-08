package org.om.design.pattern.factorymethod;

import java.io.File;

public class App
{
	public static void main(String[] args) 
	{
		BatchProcessor batchProcessor = createBatchProcessor(args[0]);
		batchProcessor.processBatch(new File(args[1]));
	}
	
	private static BatchProcessor createBatchProcessor(String type)
	{
		if("txt".equalsIgnoreCase(type))
		{
			return new TextBatchProcessor();
		}
		if("csv".equalsIgnoreCase(type))
		{
			return new CSVBatchProcessor();
		}
		if("xml".equalsIgnoreCase(type))
		{
			return new XMLBatchProcessor();
		}
		
		throw new RuntimeException("Provided file type '"+ type +"' is not supported.");
	}
}
