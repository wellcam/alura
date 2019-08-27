package java_io.input;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteScanner {
	
	public static void main(String[] args) throws IOException{
		
		Scanner s = new Scanner(new File("contas.csv"));
		
		while(s.hasNext()) {
			System.out.println(s.nextLine().split(",")[3]);
			
			/*
			 * A linha acima é o mesmo que:
			 * 
			 *  String linha = s.nextLine();
			 *  String [] valores = linha.split(",");
			 *  System.out.println(valores[3]);
			 */
		}
		
		s.close();
	}

}
