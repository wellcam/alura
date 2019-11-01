package br.com.bancobrasil.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.bancobrasil.dao.ClienteDAO;
import br.com.bancobrasil.model.Cliente;
import br.com.bancobrasil.model.Usuario;

public class AdicionarCliente implements Action {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ClienteDAO clienteDao = new ClienteDAO();
		Cliente cliente = new Cliente();
		HttpSession sessao = request.getSession();
		
		Usuario usuario = (Usuario) sessao.getAttribute("usuario");
		
		cliente.setUsuario(usuario);
		cliente.setNome(request.getParameter("nome"));
		cliente.setIdade(Integer.parseInt(request.getParameter("idade")));
		cliente.setDataNascimento(request.getParameter("dataNascimento"));
		cliente.setProfissao(request.getParameter("profissao"));
		
		clienteDao.adicionar(cliente);

		System.out.println(cliente.getNome());
		
		return "redirect:/bancobrasil/in?acao=FormCliente";
	}

}
