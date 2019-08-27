package java_util.comparator;

public class Professor {

	private int conhecimento;
	private int idade;
	private double peso;
	
	
	public Professor(int conhecimento, int idade, double peso) {
		super();
		this.conhecimento = conhecimento;
		this.idade = idade;
		this.peso = peso;
	}
	
	public int getConhecimento() {
		return conhecimento;
	}
	public void setConhecimento(int conhecimento) {
		this.conhecimento = conhecimento;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Professor [conhecimento=" + conhecimento + ", idade=" + idade + ", peso=" + peso + "]";
	}
	
}
