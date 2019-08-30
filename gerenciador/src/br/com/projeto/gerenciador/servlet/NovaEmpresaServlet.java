package br.com.projeto.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.gerenciador.modelo.Banco;
import br.com.projeto.gerenciador.modelo.Empresa;

//@WebServlet(urlPatterns = {"/novaEmpresa"})
public class NovaEmpresaServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Empresa empresa = new Empresa();
		empresa.setNome(req.getParameter("nome"));
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		
		
		try {
			Date dataAbertura = sdf.parse(req.getParameter("data"));
			empresa.setDataAbertura(dataAbertura);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		req.setAttribute("nomeEmpresa", empresa.getNome());
		req.setAttribute("dataAbertura", empresa.getDataAbertura());
		
		
		resp.sendRedirect("listaEmpresas");
//		RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresas");
//		rd.forward(req, resp);
	}
	
}
