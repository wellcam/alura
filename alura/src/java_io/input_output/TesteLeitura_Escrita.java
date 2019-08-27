package java_io.input_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteLeitura_Escrita {

	public static void main(String[] args) throws IOException{
		
		InputStream fis =  System.in;
//        InputStream fis = new FileInputStream("teste220819_1.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = System.out;
//        OutputStream fos = new FileOutputStream("teste220819_2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while(linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            bw.flush(); //imprimir no console
            linha = br.readLine();
        }

        
        System.out.println("Fim");
        br.close();
        bw.close();
	}

}
