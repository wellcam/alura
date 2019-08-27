package java_util;

import java.util.Random;

public class Random_Teste {

	public static void main(String[] args) {
		
		Random random = new Random();
		
//		Sequecia de 6 números aleatorios
		for(int i = 0; i < 5; i++) {
			System.out.println(random.nextInt(3));
		}
		
	}	

}
