package java_io.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesteLeitura {
	
	public static void main(String[] args) throws IOException {
		
		//Leitor de bytes
//		InputStream is = new FileInputStream("/home/wellington/Documents/teste.well"); // LENDO A PARTIR DE UM ARQUIVO
		InputStream is = System.in; // LENDO A PARTIR DE ENTRADA DE DADOS
		int a = is.read();
		
		//Leitor de chars
		InputStreamReader isr = new InputStreamReader(is);
		int b = isr.read();
		
		//Leitor de Strings
		BufferedReader br = new BufferedReader(isr);
		String c = br.readLine();
		
		
		System.out.println("InputStream: " + a);
		System.out.println("InputStreamReader: " + b);
		
		while(c != null) {
			System.out.println("BufferedReader: " + c);
			c = br.readLine();
		}
		br.close();
	}
	
}
