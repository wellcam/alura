package br.com.projeto.gerenciador.acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CriarEmpresaForm implements Acao {

	public String executar(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		return "forward:formNovaEmpresa.jsp";
		
	}


}
