package java_util.comparable;

public class Jogador implements Comparable<Jogador>{

	private int forca;
	private int velocidade;
	private double peso;
	
	public Jogador(int forca, int velocidade, double peso) {
		super();
		this.forca = forca;
		this.velocidade = velocidade;
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Jogador [forca=" + forca + ", velocidade=" + velocidade + ", peso=" + peso + "]";
	}

	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public int compareTo(Jogador jogador2) {
		if(this.getVelocidade() > jogador2.getVelocidade()) {
			return -1;
		}
			return 1;
	}
}
