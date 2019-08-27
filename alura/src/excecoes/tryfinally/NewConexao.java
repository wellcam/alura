package excecoes.tryfinally;

public class NewConexao implements AutoCloseable{
	
	public NewConexao() {
		System.out.println("Abre conexao");
	}
	
	
	public void lerDados() {
		System.out.println("Recebendo dados");
        throw new IllegalStateException();
	}

	
	@Override
	public void close()  {
		 System.out.println("Fecha conexao");
		
	}
	
}
