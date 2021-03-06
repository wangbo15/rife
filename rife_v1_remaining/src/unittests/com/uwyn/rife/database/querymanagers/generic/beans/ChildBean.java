/*
 * Copyright 2001-2008 Geert Bevin <gbevin[remove] at uwyn dot com> and
 * JR Boyens <gnu-jrb[remove] at gmx dot net>
 * Licensed under the Apache License, Version 2.0 (the "License")
 * $Id: ChildBean.java 3918 2008-04-14 17:35:35Z gbevin $
 */
package com.uwyn.rife.database.querymanagers.generic.beans;

import com.uwyn.rife.database.querymanagers.generic.beans.ParentBean;

public class ChildBean extends ParentBean
{
	private String mChildString = null;
	
	public void setChildString(String childString)
	{
		mChildString = childString;
	}
	
	public String getChildString()
	{
		return mChildString;
	}
}

