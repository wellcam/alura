package java_util;

import java.text.SimpleDateFormat;//**
import java.util.Date;

public class Date_Teste {

	public static void main(String[] args) {
		
//		As informções são baseadas no sistema do computador
		Date data = new Date();
		
//**	Classe resonsável por organizar dados obtidos pelo Date		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

		
		//Sem SimpleDateFormat
		System.out.println("Completo: " + data);	
		System.out.println("Hora atual: " + data.getHours());
		
		System.out.println("----------------");
		
		//Com SimpleDateFormat
		System.out.println(sdf.format(data));
		
	}
}
