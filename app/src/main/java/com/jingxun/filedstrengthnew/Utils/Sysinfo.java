package com.jingxun.filedstrengthnew.Utils;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.Display;

public class Sysinfo
{

	private int miVCode;
	private int miscreenHeight;
	private int miscreenWidth;
	private String msVName;
	private String mspackageName;

	public Sysinfo(Activity activity)
	{
		PackageManager packagemanager;
		try
		{
			packagemanager = activity.getPackageManager();
			PackageInfo packageinfo = packagemanager.getPackageInfo(activity.getPackageName(), 0);
			mspackageName = packageinfo.packageName;
			miVCode = packageinfo.versionCode;
			msVName = packageinfo.versionName;
			Display display = activity.getWindowManager().getDefaultDisplay();
			miscreenHeight = display.getHeight();
			miscreenWidth = display.getWidth();
		}
		catch (PackageManager.NameNotFoundException namenotfoundexception)
		{
			
		}
	}

	public String getPackageName()
	{
		return mspackageName;
	}

	public int getscreenHeight()
	{
		return miscreenHeight;
	}

	public int getscreenWidth()
	{
		return miscreenWidth;
	}

	public int getversionCode()
	{
		return miVCode;
	}

	public String getversionName()
	{
		return msVName;
	}
}
