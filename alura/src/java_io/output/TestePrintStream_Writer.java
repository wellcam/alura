package java_io.output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TestePrintStream_Writer {

	public static void main(String[] args) throws IOException{
		
//		PrintStream ps = new PrintStream(new FileOutputStream("teste230819_1.txt", true));
		PrintWriter pw = new PrintWriter("teste230819_1.txt");
		
		
		pw.println("I lova Java");
		pw.println(56);
		pw.println("Fim Print");
		
		pw.close();
	}
	
}
