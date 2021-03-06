/*
 * Copyright 2001-2008 Geert Bevin (gbevin[remove] at uwyn dot com)
 * Licensed under the Apache License, Version 2.0 (the "License")
 * $Id: TestCallSimpleCallTarget1.java 3941 2008-04-26 21:28:32Z gbevin $
 */
package com.uwyn.rife.continuations;

public class TestCallSimpleCallTarget1 extends AbstractContinuableObject
{
	public void execute()
	{
		String answer = "during call target 1\n"+call(TestCallSimpleCallTarget2.class);
		answer(answer);
	}
}