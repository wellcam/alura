package br.com.projeto.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlterarEmpresaServlet
 */
@WebServlet("/alterarEmpresa")
public class AlterarEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String nome =  request.getParameter("nome");
		String data = request.getParameter("data");
		
		Banco banco = new Banco();
		
		Empresa empresa = banco.atualizarEmpresaById(id);
		
		empresa.setNome(nome);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date dataAbertura = sdf.parse(data);
			empresa.setDataAbertura(dataAbertura);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		response.sendRedirect("listaEmpresas");
		
	}

}
