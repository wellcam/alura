package br.com.bancobrasil.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.bancobrasil.dao.impl.ClienteDAO;
import br.com.bancobrasil.model.Cliente;
import br.com.bancobrasil.model.Usuario;

public class ListarClientes implements Action{

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ClienteDAO clienteDao = new ClienteDAO();
		HttpSession sessao = request.getSession();
		
		Usuario usuario = (Usuario) sessao.getAttribute("usuario");
		
		List<Cliente> clientes = clienteDao.listar(usuario);
		
		request.setAttribute("clientes", clientes);
		
		return "forward:listaClientes.jsp";
	}

}
