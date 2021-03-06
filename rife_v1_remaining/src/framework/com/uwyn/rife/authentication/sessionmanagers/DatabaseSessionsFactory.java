/*
 * Copyright 2001-2008 Geert Bevin (gbevin[remove] at uwyn dot com) and
 * Steven Grimm <koreth[remove] at midwinter dot com>
 * Licensed under the Apache License, Version 2.0 (the "License")
 * $Id: DatabaseSessionsFactory.java 3918 2008-04-14 17:35:35Z gbevin $
 */
package com.uwyn.rife.authentication.sessionmanagers;

import com.uwyn.rife.database.Datasource;
import com.uwyn.rife.database.DbQueryManagerCache;
import com.uwyn.rife.database.DbQueryManagerFactory;
import com.uwyn.rife.ioc.HierarchicalProperties;
import com.uwyn.rife.ioc.exceptions.MandatoryPropertyMissingException;
import com.uwyn.rife.ioc.exceptions.PropertyValueException;

/**
 * Factory for {@link DatabaseSessions} manager instances that creates singletons
 * based on the {@code Datasource}.
 *
 * @author Steven Grimm (koreth[remove] at midwinter dot com)
 * @author Geert Bevin (gbevin[remove] at uwyn dot com)
 * @version $Revision: 3918 $
 * @since 1.0
 */
public class DatabaseSessionsFactory extends DbQueryManagerFactory implements SessionManagerFactory
{
	/** The package name of the datasource-specific implementations */
	public static final String	MANAGER_PACKAGE_NAME = DatabaseSessionsFactory.class.getPackage().getName()+".databasedrivers.";
	
	private static DbQueryManagerCache	mCache = new DbQueryManagerCache();
	
	/**
	 * Return an instance of {@code DatabaseSessions} for the provided
	 * {@code Datasource}.
	 *
	 * @param datasource the datasource that will be used to create the manager
	 * @return the requested {@code DatabaseSessions} instance
	 * @since 1.0
	 */
	public static DatabaseSessions getInstance(Datasource datasource)
	{
		return (DatabaseSessions)getInstance(MANAGER_PACKAGE_NAME, mCache, datasource);
	}

	public DatabaseSessions getManager(HierarchicalProperties properties)
	throws PropertyValueException
	{
		Datasource	datasource = properties.getValueTyped("datasource", Datasource.class);
		if (null == datasource)
		{
			throw new MandatoryPropertyMissingException("datasource");
		}

		return getInstance(datasource);
	}
}
