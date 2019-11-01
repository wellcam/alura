package br.com.bancobrasil.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/in")
public class AutenticacaoFilter implements Filter{

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}
	
	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		String acao = request.getParameter("acao");
		HttpSession sessao = request.getSession();
		boolean usuarioNaoLogado = (sessao.getAttribute("usuario") == null);
		boolean pageNeedLogon = !(acao.equals("Login") || acao.equals("FormLogin") || acao.equals("FormUsuario") || acao.equals("AdicionarUsuario")); 
		
		if(pageNeedLogon && usuarioNaoLogado) {
			response.sendRedirect("/bancobrasil/in?acao=FormLogin");
			return;
		}
		
		chain.doFilter(request, response);
	}

}
