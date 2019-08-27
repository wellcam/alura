package java_io.input;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args){

		try {

			FileInputStream fis = new FileInputStream("meu_arquivo.txt");
			Scanner in = new Scanner(fis);

			while(in.hasNext()) {
				System.out.println(in.nextLine());
			}

		} catch (IOException e) {

			e.printStackTrace();

		}
	}
}
