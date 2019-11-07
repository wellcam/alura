package br.com.bancobrasil.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.bancobrasil.dao.impl.CategoriaProfissaoDAO;
import br.com.bancobrasil.dao.impl.ClienteDAO;
import br.com.bancobrasil.dao.impl.ProfissaoDAO;
import br.com.bancobrasil.model.CategoriaProfissao;
import br.com.bancobrasil.model.Cliente;
import br.com.bancobrasil.model.Profissao;
import br.com.bancobrasil.model.Usuario;

public class AdicionarProfissao implements Action {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProfissaoDAO profissaoDao = new ProfissaoDAO();
		Profissao profissao = new Profissao();
		CategoriaProfissaoDAO categoriaDao = new CategoriaProfissaoDAO();
		
		Integer categoriaId = Integer.parseInt(request.getParameter("categoria"));
		
		CategoriaProfissao categoria = categoriaDao.buscarPorId(categoriaId); 
		
		profissao.setNome(request.getParameter("nome"));
		profissao.setCategoria(categoria);
		
		profissaoDao.adicionar(profissao);

		return "redirect:/bancobrasil/in?acao=FormProfissao";
	}

}
