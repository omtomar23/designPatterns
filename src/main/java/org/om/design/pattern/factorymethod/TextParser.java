package org.om.design.pattern.factorymethod;

import java.io.File;
import java.util.List;

public class TextParser implements Parser
{
	private File file;
	public TextParser(File file)
	{
		this.file = file;
	}
	public List<Records> parse() 
	{
		return null;
	}

}
