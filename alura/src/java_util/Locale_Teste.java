package java_util;

import java.util.Locale;

public class Locale_Teste {
	
	public static void main(String[] args) {
		
		Locale bra = new Locale("pt", "BR");
		Locale por = new Locale("pt", "PT");
		Locale eua = Locale.US;
		 
		System.out.println(eua.getDisplayCountry());
		System.out.println(bra.getDisplayCountry());
		System.out.println(por.getDisplayCountry());
		
	}

}
