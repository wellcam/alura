package java_io.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterReader_Teste {

	public static void main(String[] args) {

		File file = new File("bufferedWriterReader_teste.txt");
		
		try {

			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("Teste de escrita, BufferedWriter");
			bw.newLine();
			bw.write("Segunda linha de escrita");
			bw.newLine();
			bw.write("Finanlizando escrita");
			bw.flush();//fechando buffer
			bw.close();//fechando escrita

			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String b = null;

			while((b = br.readLine()) != null) {
				System.out.println(b);
			}

			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
