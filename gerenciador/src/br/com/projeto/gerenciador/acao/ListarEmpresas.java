package br.com.projeto.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.projeto.gerenciador.modelo.Banco;
import br.com.projeto.gerenciador.modelo.Empresa;

public class ListarEmpresas implements Acao {

	public String executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		
		List<Empresa> listaEmpresas = banco.getEmpresas();
		
		request.setAttribute("listaEmpresas", listaEmpresas);
		
		return "forward:/listaEmpresas.jsp";
	}
	
	
}
