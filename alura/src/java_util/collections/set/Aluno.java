package java_util.collections.set;

public class Aluno implements Comparable<Aluno>{
	
	private String nome;
	private String curso;
	private double nota;
	
	public Aluno(String nome, String curso, double nota) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.nota = nota;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Aluno: " + nome;
	}

	@Override
	public int compareTo(Aluno aluno) {
		return this.nome.compareTo(aluno.getNome());
	}
	
//	ETAPA 1
//	Esse metodo é utilizado pelo HashSet para verificar se existe na lista outro elemento
//	com o mesmo código hash.
	public int hashCode() {
		return this.nome.hashCode();
	}
	
//	ETAPA 2
//	Obejtos que possuem o mesmo hash não são necessáriamente iguais, caso sejam o HashSet
//	faz a chamada do equals para verificar se os campos são iguais
	public boolean equals(Object o) {
		Aluno a = (Aluno) o;
		return this.nome.equals(a.getNome());
	}
	
}
