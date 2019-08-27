package java_util.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaAluno {

	public static void main(String[] args) {

		List<Aluno> lista = new ArrayList<Aluno>();

		Aluno a = new Aluno("João da Silva", "Linux básico", 0);
		Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 0);
		Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
		Aluno d = new Aluno("Antonio Sousa", "OpenOffice", 0);

		lista.add(a);
	    lista.add(b);
	    lista.add(c);
	    lista.add(d);
	    
	    
	    Iterator<Aluno> iteraAluno = lista.iterator();
	    
	    while(iteraAluno.hasNext()) {
	    	System.out.println(iteraAluno.next().getNome());
	    }
	    
	}
}
