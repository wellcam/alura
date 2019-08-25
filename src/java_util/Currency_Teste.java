package java_util;

import java.util.Currency;
import java.util.Locale;

public class Currency_Teste {

	public static void main(String[] args) {
		
		Locale brasil = new Locale ("pt","BR");
		
		Currency brl = Currency.getInstance(brasil);
		
		System.out.println(brl);
		
	}
	
	
}
