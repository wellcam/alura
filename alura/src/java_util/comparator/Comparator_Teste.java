package java_util.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_Teste {

	public static void main(String[] args) {
		
		List<Professor> professorList = new ArrayList<>();
		
		professorList.add(new Professor(80, 42, 70.5));
		professorList.add(new Professor(85, 50, 60.5));
		professorList.add(new Professor(72, 40, 88.5));
		professorList.add(new Professor(90, 38, 56.5));
		professorList.add(new Professor(55, 35, 89.5));

		
		Collections.sort(professorList, new Comparator<Professor>() {

			@Override
			public int compare(Professor o1, Professor o2) {
				return o1.getConhecimento() > o2.getConhecimento() ? -1 : 1;
			}
			
		});
		
		
		for(Professor p : professorList) {
			System.out.println(p);
		}
		
		
	}
	
}

