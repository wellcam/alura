package br.com.bancobrasil.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bancobrasil.dao.impl.CategoriaProfissaoDAO;
import br.com.bancobrasil.dao.impl.ClienteDAO;
import br.com.bancobrasil.dao.impl.ProfissaoDAO;

public class ExcluirProfissao implements Action{

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProfissaoDAO profissaoDao = new ProfissaoDAO();
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		profissaoDao.excluir(id);
		
		return "redirect:/bancobrasil/in?acao=ListarProfissoes";
		
	}

}
