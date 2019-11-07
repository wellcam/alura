package br.com.bancobrasil.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bancobrasil.dao.impl.ProfissaoDAO;
import br.com.bancobrasil.model.Profissao;

public class ListarProfissoes implements Action{

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ProfissaoDAO profissaoDao = new ProfissaoDAO();
		
		List<Profissao> profissoes = profissaoDao.listar();
		
		request.setAttribute("profissoes", profissoes);
		
		return "forward:listaProfissoes.jsp";
	}

}
