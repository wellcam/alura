package br.com.projeto.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.gerenciador.modelo.Banco;
import br.com.projeto.gerenciador.modelo.Empresa;

/**
 * Servlet implementation class EditarEmpresaServlet
 */
//@WebServlet("/exibirEmpresa")
public class ExibitEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Banco banco = new Banco();
		
		Empresa empresa = banco.getEmpresaById(id);
		
		request.setAttribute("empresa", empresa);
		RequestDispatcher rd = request.getRequestDispatcher("formEditarEmpresa.jsp");
		
		rd.forward(request, response);
		
		
		
	}

}
