package com.ammarnaji;

import com.phone.OS;
import com.phone.OperatingSystemFactory;

public class Main {
	public static void main(String a[]) {
		OperatingSystemFactory asf= new OperatingSystemFactory();
		OS obj=asf.getInstance("Android");
		obj.Spec();
	}
	
}
