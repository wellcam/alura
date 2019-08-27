package java_util.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Teste {
	
	public static void main(String[] args) {
		
		final int MAX = 20000;
		long tInicio = System.currentTimeMillis();
		
//		List<Integer> lista = new ArrayList<Integer>(); //Tempo menor de execução
		List<Integer> lista = new LinkedList<Integer>(); //Tempo maior de execução
		
		for (int i = 0; i < MAX; i++) {
			lista.add(i);
		}
		
		for (int i = 0; i < MAX; i++) {
			lista.contains(i);
		}		
		
		
		long tFim = System.currentTimeMillis();
		
		System.out.println("Tempo: " + (tFim - tInicio));
	}

}
