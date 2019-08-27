package br.com.projeto.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/novaEmpresa"})
public class NovaEmpresaServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Empresa empresa = new Empresa();
		empresa.setNome(req.getParameter("nome"));
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body>Empresa: " +  empresa.getNome() + " cadastrada com sucesso</body></html>");
		
		
	}
	
}
