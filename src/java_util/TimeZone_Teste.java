package java_util;

import java.util.TimeZone;

public class TimeZone_Teste {

	public static void main(String[] args) {
		
		TimeZone tz = TimeZone.getDefault();
		
		System.out.println(tz.getDisplayName());
		System.out.println(tz.getDSTSavings());
	}
	
}
