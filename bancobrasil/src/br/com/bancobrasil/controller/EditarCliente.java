package br.com.bancobrasil.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bancobrasil.dao.ClienteDAO;
import br.com.bancobrasil.model.Cliente;

/**
 * Servlet implementation class EditarCliente
 */
@WebServlet("/editarCliente")
public class EditarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClienteDAO clienteDao = new ClienteDAO();
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		Cliente cliente = clienteDao.editar(id);
		
		request.setAttribute("cliente", cliente);
		
		RequestDispatcher rd = request.getRequestDispatcher("atualizarCliente.jsp");
		rd.forward(request, response);
		
	}

}
