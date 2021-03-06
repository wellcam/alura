package br.com.bancobrasil.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bancobrasil.dao.impl.UsuarioDAO;
import br.com.bancobrasil.model.Usuario;

public class FormLogin implements Action {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String incorreto = request.getParameter("incorreto");
		if(incorreto != null) {
			request.setAttribute("incorreto", true);
		}
		return "forward:login.jsp";
	}

}
