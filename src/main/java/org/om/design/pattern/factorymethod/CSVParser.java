package org.om.design.pattern.factorymethod;

import java.io.File;
import java.util.List;

public class CSVParser implements Parser
{
	private File file;
	public CSVParser(File file)
	{
		this.file = file;
	}
	public List<Records> parse() 
	{
		return null;
	}
}
