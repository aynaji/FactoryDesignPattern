package com.phone;

public class OperatingSystemFactory {

	public OS getInstance(String str)
	{
		if(str.equals("Android"))
			return new Android();
		else
			return new IOS();
	}
}
