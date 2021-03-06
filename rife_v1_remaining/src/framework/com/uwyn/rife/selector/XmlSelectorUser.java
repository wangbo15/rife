/*
 * Copyright 2001-2008 Geert Bevin (gbevin[remove] at uwyn dot com)
 * Licensed under the Apache License, Version 2.0 (the "License")
 * $Id: XmlSelectorUser.java 3918 2008-04-14 17:35:35Z gbevin $
 */
package com.uwyn.rife.selector;

public class XmlSelectorUser implements XmlSelector
{
	public String getXmlPath(String prefix)
	{
		return prefix+System.getProperty("user.name").replace('.', '_').replace(' ', '_').toLowerCase()+".xml";
	}
}
