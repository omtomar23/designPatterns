package org.om.design.pattern.factorymethod;

import java.io.File;
import java.util.List;

public class XMLParser implements Parser
{
	private File file;
	public XMLParser(File file)
	{
		this.file = file;
	}
	public List<Records> parse() 
	{
		return null;
	}

}
