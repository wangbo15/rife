/*
 * Copyright 2001-2008 Geert Bevin <gbevin[remove] at uwyn dot com>
 * Licensed under the Apache License, Version 2.0 (the "License")
 * $Id: SitestructurePaneGridSnapToolAction.java 3918 2008-04-14 17:35:35Z gbevin $
 */
package com.uwyn.rife.gui.ui.actions;

import com.uwyn.rife.swing.Images;
import com.uwyn.rife.tools.Localization;

public class SitestructurePaneGridSnapToolAction extends EditorPaneToolAction
{
	public SitestructurePaneGridSnapToolAction()
	{
		super(null,
			Images.getRepInstance().getImageIcon("gridsnap.gif"),
			Localization.getString("rife.tooltip.tool.gridsnap"));
	}
}


