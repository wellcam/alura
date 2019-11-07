package br.com.bancobrasil.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.bancobrasil.dao.impl.ClienteDAO;
import br.com.bancobrasil.dao.impl.ProfissaoDAO;
import br.com.bancobrasil.model.Cliente;
import br.com.bancobrasil.model.Profissao;
import br.com.bancobrasil.model.Usuario;

public class SalvarCliente implements Action {
       
	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ProfissaoDAO profissaoDao = new ProfissaoDAO();
		ClienteDAO clienteDao = new ClienteDAO();
		Cliente cliente = new Cliente();
		
		
		HttpSession sessao = request.getSession();
		Usuario usuario = (Usuario) sessao.getAttribute("usuario");
		Integer idProfissao = Integer.parseInt(request.getParameter("profissao"));
		Profissao profissao = profissaoDao.buscarPorId(idProfissao);
				
		cliente.setUsuario(usuario);
		cliente.setId(Integer.parseInt(request.getParameter("id")));
		cliente.setNome(request.getParameter("nome"));
		cliente.setIdade(Integer.parseInt(request.getParameter("idade")));
		cliente.setDataNascimento(request.getParameter("dataNascimento"));
		cliente.setProfissao(profissao);
		
		clienteDao.salvar(cliente);
		
		return "redirect:/bancobrasil/in?acao=ListarClientes";
	}

}
