package br.com.casadocodigo.loja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.casadocodigo.loja.daos.ProdutoDao;
import br.com.casadocodigo.loja.enums.TipoPreco;
import br.com.casadocodigo.loja.models.Produto;

@Controller
public class ProdutosController {
	
	@Autowired
	private ProdutoDao produtoDao;
	
	@RequestMapping("produtos/form")
	public ModelAndView form() {
		ModelAndView model = new ModelAndView("produtos/form");
		model.addObject("tipos", TipoPreco.values());
		return model;
	}

	@RequestMapping(value = "/produtos", method = RequestMethod.POST)
	public String cadastrar(Produto produto) {
		System.out.println(produto);
		produtoDao.cadastrar(produto);
		return "produtos/ok";
	}
	
	@RequestMapping(value = "/produtos", method = RequestMethod.GET)
	public ModelAndView listar(){
		ModelAndView model = new ModelAndView("produtos/lista");
		model.addObject("produtos", produtoDao.listar());
		return model;
	}
}
