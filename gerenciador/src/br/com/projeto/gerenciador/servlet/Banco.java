package br.com.projeto.gerenciador.servlet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> listaEmpresas = new ArrayList<Empresa>();
	private static int chave = 1; 
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		empresa.setDataAbertura(new Date());
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Google");
		empresa2.setDataAbertura(new Date());
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		banco.adiciona(empresa2);
		
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(chave++);
		Banco.listaEmpresas.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return Banco.listaEmpresas;
	}

	public void removerId(int id) {
		
		Iterator<Empresa> listaInterator = Banco.listaEmpresas.iterator();
				
		while(listaInterator.hasNext()) {
		if (listaInterator.next().getId() == id) {
			listaInterator.remove();
		}
	}		
	}

	public Empresa getEmpresaById(int id) {
		for(Empresa e : Banco.listaEmpresas) {
			if (e.getId() == id) {
				return e;
			}
		}
		return null;
	}

	public Empresa atualizarEmpresaById(int id) {
		for(Empresa empresa : Banco.listaEmpresas) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}
	
}
