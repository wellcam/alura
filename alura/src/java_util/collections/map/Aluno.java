package java_util.collections.map;

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
		return nome;
	}

	@Override
	public int compareTo(Aluno aluno) {
		return this.nome.compareTo(aluno.getNome());
	}
	
}
