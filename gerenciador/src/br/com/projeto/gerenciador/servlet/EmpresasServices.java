package br.com.projeto.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import br.com.projeto.gerenciador.modelo.Banco;
import br.com.projeto.gerenciador.modelo.Empresa;

/**
 * Servlet implementation class EmpresasServices
 */
@WebServlet("/empresas")
public class EmpresasServices extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Empresa> empresas = new Banco().getEmpresas();
		
		String cabecalho = request.getHeader("Accept");
		
		if(cabecalho.contains("xml")) {

//			RETORNANDO XML
			XStream xstream = new XStream();
			xstream.alias("empresa", Empresa.class);
			String xml = xstream.toXML(empresas);
			
			response.setContentType("applicantion/xml");;
			response.getWriter().print(xml);
		
		} else if (cabecalho.contains("json")) {

//			RETORNANDO JSON
			Gson gson = new Gson();
			String json = gson.toJson(empresas);
			
			response.setContentType("applicantion/json");;
			response.getWriter().print(json);
			
		} else {
			
			response.setContentType("applicantion/json");;
			response.getWriter().print("message: { not contente }");
			
		}

		
	}

}
