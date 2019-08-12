package excecoes.tryfinally;

public class TesteConexao {

	public static void main(String[] args) {

		try(NewConexao con = new NewConexao()){
			con.lerDados();
		} catch (IllegalStateException e) {
			System.out.println("Deu erro!");
		}
		
//		Quando implementamos a interface (contrato) AutoCloseble automaticamente é
//		inserido um metodo de fechamento.
//		Nesse try com recurso, ele já executa o construtor da classe NewConexao e como encontrou erro, 
//		automaticamente já executou o método close. 
		
		
//		TRY SEM RECURSOS 
/*		Conexao con = null;
		
		try {
			con = new Conexao();
			con.lerDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro!");
		} finally {
			con.fechaConexao();
		}*/
		
	}
	
}
