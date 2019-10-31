package br.com.bancobrasil.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bancobrasil.dao.ClienteDAO;

/**
 * Servlet implementation class ExcluirCliente
 */
@WebServlet("/excluirCliente")
public class ExcluirCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClienteDAO clienteDao = new ClienteDAO();
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		clienteDao.excluir(id);
		
		response.sendRedirect("/bancobrasil/listarClientes");
		
	}

}
