package java_util.collections.set;

import java.util.HashSet;
import java.util.Set;

public class Set_Teste {
	
	public static void main(String[] args) {
		
		Set<Aluno> lista = new HashSet<Aluno>();
		
	    Aluno a = new Aluno("João da Silva", "Linux básico", 0);
	    Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
	    Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
	    Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 0);
	    
	    lista.add(a);
	    lista.add(b);
	    lista.add(c);
	    lista.add(d);
	    
	    for(Aluno l : lista) {
	    	System.out.println(l);
	    }
		
	}
	
}
