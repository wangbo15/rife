/*
 * Copyright 2001-2008 Geert Bevin (gbevin[remove] at uwyn dot com)
 * Licensed under the Apache License, Version 2.0 (the "License")
 * $Id: GlobalvarParent.java 3918 2008-04-14 17:35:35Z gbevin $
 */
package com.uwyn.rife.engine.testelements.inheritance;

import com.uwyn.rife.engine.Element;

public class GlobalvarParent extends Element
{
	public void processElement()
	{
		if (hasSubmission("activatechild"))
		{
			setOutput("globalvar1", "ok");
		}
		
		print("<html><body><a href=\""+getSubmissionQueryUrl("activatechild")+"\">activate child</a></body></html>");
	}
	
	public boolean childTriggered(String name, String[] values)
	{
		if (name.equals("globalvar1") &&
			values[0].equals("ok"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

