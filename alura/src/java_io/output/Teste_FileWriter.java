package java_io.output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Teste_FileWriter {

	public static void main(String[] args) throws IOException{
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("teste230819_1.txt", true));
		
		bw.write("Wellington de Sena Araújo Camilo");
//		bw.write(System.lineSeparator());
//		bw.write(System.lineSeparator());
//		bw.write(System.lineSeparator());
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write("Fim de escrita FileWriter");
		
		bw.close();
	}
}
