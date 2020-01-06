package br.com.casadocodigo.loja.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.casadocodigo.loja.daos.ProdutoDao;
import br.com.casadocodigo.loja.enums.TipoPreco;
import br.com.casadocodigo.loja.infra.FileSaver;
import br.com.casadocodigo.loja.models.Produto;
import br.com.casadocodigo.loja.validators.ProdutoValidator;

@Controller
@RequestMapping(value = "/produtos")
public class ProdutosController {
	
	@Autowired
	private ProdutoDao produtoDao;

    @Autowired
    private FileSaver fileSaver;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(new ProdutoValidator());
	}
	
	@RequestMapping("form")
	public ModelAndView form(Produto produto) {
		ModelAndView model = new ModelAndView("produtos/form");
		model.addObject("tipos", TipoPreco.values());
		return model;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView cadastrar(MultipartFile sumario, @Valid Produto produto, BindingResult result, RedirectAttributes redirectAttributes) {
		
		if(result.hasErrors()) {
			return form(produto);
		}
		
	    String path = fileSaver.write("arquivos-sumario", sumario);
	    produto.setSumarioPath(path);
		
		produtoDao.cadastrar(produto);
		ModelAndView model = new ModelAndView("redirect:produtos");
//		Flash Scoped - Atributos que duram apenas de uma requisicao a outra
		redirectAttributes.addFlashAttribute("sucesso", "Produto cadastrado com sucesso");
		return model;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listar(){
		ModelAndView model = new ModelAndView("produtos/lista");
		model.addObject("produtos", produtoDao.listar());
		return model;
	}
}
