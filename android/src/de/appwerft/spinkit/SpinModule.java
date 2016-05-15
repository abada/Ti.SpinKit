/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package de.appwerft.spinkit;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;

@Kroll.module(name = "Spin", id = "de.appwerft.spinkit")
public class SpinModule extends KrollModule {

	// Standard Debugging variables
	private static final String LCAT = "SpinModule";

	// You can define constants with @Kroll.constant, for example:
	@Kroll.constant
	public static final int TYPE_ROTATINGPLANE = 0;
	public static final int TYPE_DOUBLEBOUNCE = 1;
	public static final int TYPE_WAVE = 2;
	public static final int TYPE_WANDERINGCUBES = 3;
	public static final int TYPE_PULSE = 4;
	public static final int TYPE_CHASINGDOTS = 5;
	

	public SpinModule() {
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app) {
		Log.d(LCAT, "inside onAppCreate");
		// put module init code that needs to run when the application is
		// created
	}

}
