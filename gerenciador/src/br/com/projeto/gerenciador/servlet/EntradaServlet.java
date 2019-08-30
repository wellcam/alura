package br.com.projeto.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.projeto.gerenciador.acao.Acao;

/**
 * Servlet implementation class Entrada
 */
@WebServlet("/entrada")
public class EntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String PACKAGE_NAME = "br.com.projeto.gerenciador.acao.";
		final String WEB_VIEW_PACKAGE = "/WEB-INF/view/";
		
		String paramAcao = request.getParameter("acao");
		String fqn = PACKAGE_NAME + paramAcao;
		String redirect = null;
		
		HttpSession sessao = request.getSession();
		
		boolean usuarioNaoLogado = (sessao.getAttribute("usuario") == null);
		
		boolean pageNeedLogon = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm")); 
		
		if(pageNeedLogon && usuarioNaoLogado) {
			response.sendRedirect("entrada?acao=LoginForm");
			return;
		}
		
		
		try {
			
			Class classe = Class.forName(fqn); //carrega a classe com o nome
			
			Acao acao = (Acao) classe.newInstance(); //cria uma referencia da classe com uma instancia
													 //Cast necessário pois retorna um object
			
			redirect = acao.executar(request, response);
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String [] prefix = redirect.split(":");
		
		if(prefix[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher(WEB_VIEW_PACKAGE + prefix[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(prefix[1]);
		}
		
		
//		METODO CHEIO DE IFs ABAIXO
		
//		String redirect = null;
//		if(paramAcao.equals("listarEmpresas")) {
//			ListarEmpresas acao = new ListarEmpresas();
//			redirect = acao.executar(request, response);
//		} else if (paramAcao.equals("criarEmpresa")) {
//			CriarEmpresa acao = new CriarEmpresa();
//			redirect = acao.executar(request, response);
//		} else if (paramAcao.equals("removerEmpresa")) {
//			RemoverEmpresa acao = new RemoverEmpresa();
//			redirect = acao.executar(request, response);
//		} else if (paramAcao.equals("exibirEmpresa")) {
//			ExibirEmpresa acao = new ExibirEmpresa();
//			redirect = acao.executar(request, response);
//		} else if (paramAcao.equals("editarEmpresa")) {
//			EditarEmpresa acao = new EditarEmpresa();
//			redirect = acao.executar(request, response);
//		} else if (paramAcao.equals("criarEmpresaForm")) {
//			CriarEmpresaForm acao = new CriarEmpresaForm();
//			redirect = acao.executar(request, response);
//		}
		
	}

}
