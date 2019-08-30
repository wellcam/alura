package br.com.projeto.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.gerenciador.modelo.Banco;
import br.com.projeto.gerenciador.modelo.Empresa;

public class EditarEmpresa implements Acao {

	public String executar(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
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
		
		return "redirect:entrada?acao=ListarEmpresas";
		
	}

}
