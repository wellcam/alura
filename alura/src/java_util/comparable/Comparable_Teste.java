package java_util.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_Teste {

	public static void main(String[] args) {
		
		
		List<Jogador> jogadorList = new ArrayList<>();
		jogadorList.add(new Jogador(80,69,88.5));
		jogadorList.add(new Jogador(95,25,92.8));
		jogadorList.add(new Jogador(78,92,70.6));
		jogadorList.add(new Jogador(71,80,82.2));
		jogadorList.add(new Jogador(50,95,72.1));
		
		
//		Mais veloz
		Collections.sort(jogadorList);
		
		for(Jogador j : jogadorList) {
			System.out.println(j);
		}
		
	}
	
	
}
