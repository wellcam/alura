package excecoes;

import excecoes.minhaexcecao.MinhaExcecao;

public class TesteMinhaExcecao {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Fim do main");
	}
	
	private static void metodo1() throws MinhaExcecao{
		System.out.println("Inicio metodo1");
		metodo2();
		System.out.println("Fim metodo2");
	}
	
	private static void metodo2() throws MinhaExcecao{
		System.out.println("Inicio metodo2");
		throw new MinhaExcecao();
	}
}
