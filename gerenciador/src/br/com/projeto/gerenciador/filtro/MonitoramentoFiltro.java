package br.com.projeto.gerenciador.filtro;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//Filtro sera aplicado em cima da controller indicada
@WebFilter(urlPatterns = "/entrada")
public class MonitoramentoFiltro implements Filter{

	//Server Container Jetty exigi que tenha
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}
	
	//Server Container Jetty exigi que tenha
	@Override
	public void destroy() {}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		long antes = System.currentTimeMillis();
		
		String acao = request.getParameter("acao");
		
		chain.doFilter(request, response);
		
		long depois = System.currentTimeMillis();
		
		System.out.println("Tempo de execução da acao: " + acao + " --> " + (depois - antes) + "ms");
		
	}

}
