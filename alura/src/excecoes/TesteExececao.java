package excecoes;

public class TesteExececao {
	
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Fim do main");
	}
	
	private static void metodo1() {
		System.out.println("Inicio metodo1");
		metodo2();
		System.out.println("Fim metodo2");
	}
	
	private static void metodo2() {
		System.out.println("Inicio metodo2");
		for (int i = 1; i < 5; i++) {
			System.out.println(i);
			
//			int a = i / 0; //ArithmeticException
			
			Conta c = null; //NullPointerException
			c.deposita(); //NullPointerException
		}
	}

}
