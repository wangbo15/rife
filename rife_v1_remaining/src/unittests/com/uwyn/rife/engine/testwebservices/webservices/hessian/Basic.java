/*
 * Copyright 2001-2008 Geert Bevin (gbevin[remove] at uwyn dot com)
 * Licensed under the Apache License, Version 2.0 (the "License")
 * $Id: Basic.java 3918 2008-04-14 17:35:35Z gbevin $
 */
package com.uwyn.rife.engine.testwebservices.webservices.hessian;

public class Basic implements BasicApi
{
	public String hello()
	{
		return "Hello, world";
	}
}
