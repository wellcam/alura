package java_io.serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		
		
//		Cria um arquivo binario. Serializando. objeto --> bits/bytes
//		String nome = "Wellington Camilo";
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		oos.writeObject(nome);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		System.out.println(ois.readObject());
		ois.close();
		
		
		System.out.println("Fim da operacao");
		
	}
	
}
