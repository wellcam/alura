package java_util;

import java.util.Calendar;

public class Calendar_Teste {

	public static void main(String[] args) {
		
		Calendar calendario = Calendar.getInstance();
		
		System.out.println("Data completa: " + calendario.getTime());
		System.out.println("Ano: " + calendario.get(Calendar.YEAR));
		
//		Adicionando data
		calendario.set(Calendar.DAY_OF_MONTH, 15);
		
		System.out.println("Dia: " + calendario.get(Calendar.DAY_OF_MONTH));
	}

}
