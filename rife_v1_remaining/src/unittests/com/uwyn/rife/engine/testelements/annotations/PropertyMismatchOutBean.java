/*
 * Copyright 2001-2008 Geert Bevin <gbevin[remove] at uwyn dot com>
 * Licensed under the Apache License, Version 2.0 (the "License")
 * $Id: PropertyMismatchOutBean.java 3918 2008-04-14 17:35:35Z gbevin $
 */
package com.uwyn.rife.engine.testelements.annotations;

import com.uwyn.rife.engine.Element;
import com.uwyn.rife.engine.annotations.Elem;
import com.uwyn.rife.engine.annotations.OutBeanProperty;
import com.uwyn.rife.engine.testelements.exits.BeanImpl1;

@Elem
public class PropertyMismatchOutBean extends Element
{
	public final static String PROPERTY_NAME = "badname";

	@OutBeanProperty(name=PROPERTY_NAME)
	public void setOutBean1(BeanImpl1 var)
	{
	}
}
