package br.com.bancobrasil.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bancobrasil.dao.impl.ClienteDAO;
import br.com.bancobrasil.dao.impl.ProfissaoDAO;
import br.com.bancobrasil.model.Cliente;
import br.com.bancobrasil.model.Profissao;

public class EditarCliente implements Action{
	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ClienteDAO clienteDao = new ClienteDAO();
		ProfissaoDAO profissaoDao = new ProfissaoDAO();
		List<Profissao> profissoes = profissaoDao.listar();
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		Cliente cliente = clienteDao.editar(id);
		
		request.setAttribute("cliente", cliente);
		request.setAttribute("profissoes", profissoes);
		
		return "forward:formEditarCliente.jsp";
	}

}
