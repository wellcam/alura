package br.com.bancobrasil.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bancobrasil.dao.ClienteDAO;
import br.com.bancobrasil.model.Cliente;

/**
 * Servlet implementation class ListarClientes
 */
@WebServlet("/listarClientes")
public class ListarClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClienteDAO clienteDao = new ClienteDAO();
		
		List<Cliente> clientes = clienteDao.listar();
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNome());
		}
	}

}
