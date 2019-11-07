package br.com.bancobrasil.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bancobrasil.dao.impl.CategoriaProfissaoDAO;
import br.com.bancobrasil.model.CategoriaProfissao;

public class FormProfissao implements Action{

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CategoriaProfissaoDAO categoriaDao = new CategoriaProfissaoDAO();
		
		List<CategoriaProfissao> categorias = categoriaDao.listar();
		
		request.setAttribute("categorias", categorias);

		return "forward:formAdicionarProfissao.jsp";
	}

}
