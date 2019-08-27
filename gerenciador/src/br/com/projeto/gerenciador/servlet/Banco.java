package br.com.projeto.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> listaEmpresas = new ArrayList<Empresa>();

	public void adiciona(Empresa empresa) {
		listaEmpresas.add(empresa);
	}

	private List<Empresa> getEmpresas() {
		return listaEmpresas;
	}
	
}
