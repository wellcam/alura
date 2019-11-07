package br.com.bancobrasil.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.bancobrasil.dao.impl.CategoriaProfissaoDAO;
import br.com.bancobrasil.dao.impl.UsuarioDAO;
import br.com.bancobrasil.model.CategoriaProfissao;
import br.com.bancobrasil.model.Usuario;

public class AdicionarCategoria implements Action {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CategoriaProfissaoDAO categoriaDao = new CategoriaProfissaoDAO();
		CategoriaProfissao categoriaProfissao = new CategoriaProfissao();

		categoriaProfissao.setNome(request.getParameter("nome"));
		
		categoriaDao.adicionar(categoriaProfissao);
		
		return "redirect:/bancobrasil/in?acao=FormCategoria";
	}
}
