package br.com.casadocodigo.loja.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.casadocodigo.loja.models.Produto;

public class ProdutoValidator implements Validator{
	
//	public void valida (Produto produto, Errors errors) {
//		ValidationUtils.rejectIfEmpty(errors, "titulo", "field.required");
//		ValidationUtils.rejectIfEmpty(errors, "descricao", "field.required");
//		
//		if(produto.getPaginas() <= 0 ) {
//			errors.rejectValue("paginas", "field.required");
//		}
//	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmpty(errors, "titulo", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "descricao", "field.required");
		
		Produto produto = (Produto) target;
		if(/*produto.getPaginas() <= 0 ||*/ produto.getPaginas() == null) {
			errors.rejectValue("paginas", "field.required");
		}
	}
	
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Produto.class.isAssignableFrom(clazz);
	}

}
