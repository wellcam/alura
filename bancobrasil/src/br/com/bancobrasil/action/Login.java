package br.com.bancobrasil.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bancobrasil.dao.UsuarioDAO;
import br.com.bancobrasil.model.Usuario;

public class Login implements Action {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UsuarioDAO usuarioDao = new UsuarioDAO();
		System.out.println("Login");
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		Usuario usuario = usuarioDao.existe(login, password);
		
//		request.setAttribute("usuario", usuario);
		
		if (usuario != null) {
			return "redirect:/bancobrasil/in?acao=Home";
		} else {
			return "redirect:/bancobrasil/in?acao=FormLogin";
		}
		
	}

}
