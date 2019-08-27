package java_io.output;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteEscrita {
	
	public static void main(String[] args) throws IOException{
		
		
		OutputStream os = new FileOutputStream("teste220819_1.txt");
		
		
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("caelum");
		bw.newLine();
		bw.write("caelum2");
		
		bw.close();
	}
	
}
