package br.com.projeto.gerenciador.acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.gerenciador.modelo.Banco;

public class RemoverEmpresa implements Acao {

	public String executar(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Banco banco = new Banco();
		
		banco.removerId(id);
		
		return "redirect:entrada?acao=ListarEmpresas";
		
	}

}
