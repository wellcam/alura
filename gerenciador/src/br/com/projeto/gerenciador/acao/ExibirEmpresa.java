package br.com.projeto.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.gerenciador.modelo.Banco;
import br.com.projeto.gerenciador.modelo.Empresa;

public class ExibirEmpresa implements Acao {

	public String executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		Banco banco = new Banco();
		
		Empresa empresa = banco.getEmpresaById(id);
		
		request.setAttribute("empresa", empresa);
		
		return "forward:/formEditarEmpresa.jsp";
	}

}
