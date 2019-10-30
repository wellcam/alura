package br.com.bancobrasil.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bancobrasil.dao.ClienteDAO;
import br.com.bancobrasil.model.Cliente;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/addCliente")
public class AdicionarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ClienteDAO clienteDao = new ClienteDAO();
		Cliente cliente = new Cliente();
		
		cliente.setNome(request.getParameter("nome"));
		cliente.setIdade(Integer.parseInt(request.getParameter("idade")));
		cliente.setDataNascimento(request.getParameter("dataNascimento"));
		cliente.setProfissao(request.getParameter("profissao"));
		
		clienteDao.salvar(cliente);

		System.out.println(cliente.getNome());
		
		response.sendRedirect("cadastroCliente.jsp");

	}

}
