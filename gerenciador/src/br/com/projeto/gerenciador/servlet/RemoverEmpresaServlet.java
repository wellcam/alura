package br.com.projeto.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RemoverEmpresaServlet
 */
@WebServlet("/removerEmpresa")
public class RemoverEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Banco banco = new Banco();
		
		banco.removerId(id);
		
		response.sendRedirect("listaEmpresas");
		
	}

}
