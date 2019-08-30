package br.com.projeto.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.gerenciador.modelo.Banco;
import br.com.projeto.gerenciador.modelo.Empresa;

public class CriarEmpresa implements Acao {

	public String executar(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Empresa empresa = new Empresa();
		empresa.setNome(request.getParameter("nome"));
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		
		
		try {
			Date dataAbertura = sdf.parse(request.getParameter("data"));
			empresa.setDataAbertura(dataAbertura);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Banco banco = new Banco();
		
		banco.adiciona(empresa);
		
		request.setAttribute("nomeEmpresa", empresa.getNome());
		request.setAttribute("dataAbertura", empresa.getDataAbertura());
		
		
		return "redirect:entrada?acao=ListarEmpresas";
		
	}


}
