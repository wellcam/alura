package exemplosLang.string;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Wellington";
		nome.replace("W", "w");
		System.out.println(nome); //Não sofre alteração
		
		String outro_nome = nome.replace("W", "w");
		System.out.println(outro_nome);
		
		
		System.out.println("========TESTE SPLIT=======");
		String palavra = "pt_BR";
		
		String array[] = new String [1];
		array = palavra.toLowerCase().split("_");
		
		System.out.println(array[1]);
		
	}

}
