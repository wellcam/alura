package br.com.bancobrasil.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bancobrasil.action.Action;

/**
 * Servlet implementation class Principal
 */
@WebServlet("/in")
public class Principal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String PACKAGE_NAME = "br.com.bancobrasil.action.";
		String parametroAcao = request.getParameter("acao");
		final String fqn = PACKAGE_NAME + parametroAcao;
		String redirect = null;
		
		try {
			Class classe = Class.forName(fqn);
			Action acao = (Action) classe.newInstance();
			redirect = acao.executar(request, response);
		}catch (Exception e) {
			e.printStackTrace();
		}
		String [] prefix = redirect.split(":");
		
		if(prefix[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher(prefix[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(prefix[1]);
		}
		
	}

}
