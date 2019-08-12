package excecoes.tryfinally;

public class Conexao {

	public Conexao() {
		System.out.println("Abre conexao");
	}
	
	
	public void lerDados() {
		System.out.println("Recebendo dados");
        throw new IllegalStateException();
	}
	
	public void fechaConexao() {
		System.out.println("Fecha conexao");
	}
}
