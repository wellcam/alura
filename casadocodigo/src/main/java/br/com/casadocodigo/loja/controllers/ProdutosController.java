package br.com.casadocodigo.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.casadocodigo.loja.daos.ProdutoDao;
import br.com.casadocodigo.loja.models.Produto;

@Controller
public class ProdutosController {
	
	@Autowired
	private ProdutoDao produtoDao;
	
	@RequestMapping("produtos/form")
	public String form() {
		System.out.println("Entrando na " + ProdutosController.class.toString());
		return "produtos/form";
	}

	@RequestMapping("/produtos")
	public String cadastrar(Produto produto) {
		System.out.println(produto);
		produtoDao.cadastrar(produto);
		return "produtos/ok";
	}
}
