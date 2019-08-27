package java_util.scanner_print;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ScannerPrint {
	
	public static void main(String[] args) throws IOException {
		
		Scanner s = new Scanner(System.in);
		PrintStream ps = new PrintStream("arquivo.txt");
		
		while (s.hasNext()) {
			ps.println(s.nextLine());
		}
		
	}
	
}
