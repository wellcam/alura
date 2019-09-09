package certificacaoJava7.teste;

import java.util.ArrayList;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		Random random = new Random();
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("Wellington");
		lista.add("André");
		lista.add("Carolina");
		lista.add("Camila");
		lista.add("Laryssa");
		lista.add("Isadora");
		lista.add("Jardel");
		lista.add("Adriely");
		lista.add("Geovanna");
		
		
		String r = lista.get(random.nextInt(lista.size()));
		
		System.out.println("PARABÉNS " + r + " VOCÊ VAI PREGAR NO CULTO DE JOVENS!");
				
	}
}
