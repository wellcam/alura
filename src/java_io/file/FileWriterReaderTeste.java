package java_io.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTeste {

	public static void main(String[] args) {

		File file = new File("filewriter_teste.txt");

		try {

//			FileWriter fw = new FileWriter(file, true); TRUE, append
			FileWriter fw = new FileWriter(file);
			fw.write("Teste de escrita, FileWriter");
			fw.flush();//fechando buffer
			fw.close();//fechando escrita

			FileReader fr = new FileReader(file);
			char[] in = new char[500];
			fr.read(in);

			for(char c : in) {
				System.out.print(c);
			}
			
		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
