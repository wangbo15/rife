/*
 * Copyright 2001-2008 Geert Bevin <gbevin[remove] at uwyn dot com>
 * Licensed under the Apache License, Version 2.0 (the "License")
 * $Id: InitializationErrorException.java 3918 2008-04-14 17:35:35Z gbevin $
 */
package com.uwyn.rife.config.exceptions;

import com.uwyn.rife.xml.exceptions.XmlErrorException;

public class InitializationErrorException extends ConfigErrorException
{
	private static final long serialVersionUID = 6946315757564943787L;

	private String	mXmlPath = null;

	public InitializationErrorException(String xmlPath, XmlErrorException cause)
	{
		super("Fatal error during the generation of the config from the XML document '"+xmlPath+"'.", cause); 
		
		mXmlPath = xmlPath;
	}
	
	public String getXmlPath()
	{
		return mXmlPath;
	}
}
