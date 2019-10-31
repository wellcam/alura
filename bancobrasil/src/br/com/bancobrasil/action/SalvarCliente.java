package br.com.bancobrasil.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bancobrasil.dao.ClienteDAO;
import br.com.bancobrasil.model.Cliente;

public class SalvarCliente implements Action {
       
	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ClienteDAO clienteDao = new ClienteDAO();
		Cliente cliente = new Cliente();
		
		cliente.setId(Integer.parseInt(request.getParameter("id")));
		cliente.setNome(request.getParameter("nome"));
		cliente.setIdade(Integer.parseInt(request.getParameter("idade")));
		cliente.setDataNascimento(request.getParameter("dataNascimento"));
		cliente.setProfissao(request.getParameter("profissao"));
		
		clienteDao.salvar(cliente);
		
		return "redirect:/bancobrasil/in?acao=ListarClientes";
	}

}
