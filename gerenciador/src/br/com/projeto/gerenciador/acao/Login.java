package br.com.projeto.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.projeto.gerenciador.modelo.Banco;
import br.com.projeto.gerenciador.modelo.Usuario;

public class Login implements Acao {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		
		System.out.println("Logando: " + login);
		
		Banco banco = new Banco();
		
		Usuario usuario = banco.existeUsuario(login,senha);
		
		if(usuario != null) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuario", usuario);
			return "redirect:entrada?acao=ListarEmpresas";
		} else {
			return "redirect:entrada?acao=LoginForm";
		}
		
	}

}
