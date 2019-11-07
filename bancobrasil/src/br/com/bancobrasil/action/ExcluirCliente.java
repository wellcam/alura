package br.com.bancobrasil.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bancobrasil.dao.impl.ClienteDAO;

public class ExcluirCliente implements Action{

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ClienteDAO clienteDao = new ClienteDAO();
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		clienteDao.excluir(id);
		
		return "redirect:/bancobrasil/in?acao=ListarClientes";
		
		
	}

}
