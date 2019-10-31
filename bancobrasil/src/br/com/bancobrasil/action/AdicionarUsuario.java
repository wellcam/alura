package br.com.bancobrasil.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bancobrasil.dao.UsuarioDAO;
import br.com.bancobrasil.model.Usuario;

public class AdicionarUsuario implements Action {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UsuarioDAO usuarioDao = new UsuarioDAO();
		Usuario usuario = new Usuario();

		usuario.setNome(request.getParameter("nome"));
		usuario.setLogin(request.getParameter("login"));
		usuario.setPassword(request.getParameter("password"));
		usuario.setEmpresa(request.getParameter("empresa"));

		usuarioDao.adicionar(usuario);

		return "redirect:/bancobrasil/in?acao=Home";
	}

}
