/*
 * Copyright 2001-2008 Geert Bevin (gbevin[remove] at uwyn dot com)
 * Licensed under the Apache License, Version 2.0 (the "License")
 * $Id: ValidAuthElement.java 3918 2008-04-14 17:35:35Z gbevin $
 */
package com.uwyn.rife.authentication.elements.testelements.sessionvalidatorretriever;

import com.uwyn.rife.authentication.SessionValidatorRetriever;
import com.uwyn.rife.authentication.exceptions.CredentialsManagerException;
import com.uwyn.rife.engine.Element;

public class ValidAuthElement extends Element
{
	public void processElement()
	{
		try
		{
			print(SessionValidatorRetriever.getSessionValidator(getSite(), ".INPUT.MEMORY_AUTHENTICATED_BASIC", null).getClass().getName());
		}
		catch (CredentialsManagerException e)
		{
			print(e.getMessage());
		}
	}
}

