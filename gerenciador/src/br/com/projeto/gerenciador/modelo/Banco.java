package br.com.projeto.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> listaEmpresas = new ArrayList<Empresa>();
	private static List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	private static int chave = 1; 
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		empresa.setDataAbertura(new Date());
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Google");
		empresa2.setDataAbertura(new Date());
		
		Usuario usuario = new Usuario();
		usuario.setLogin("well");
		usuario.setSenha("12345");
		Usuario usuario2 = new Usuario();
		usuario2.setLogin("teste");
		usuario2.setSenha("54321");
		
		listaEmpresas.add(empresa);
		listaEmpresas.add(empresa2);
		listaUsuarios.add(usuario);
		listaUsuarios.add(usuario2);
		
		
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

	public Usuario existeUsuario(String login, String senha) {
		
		for (Usuario usuario : listaUsuarios) {
			if(usuario.ehIgual(login, senha)) {
				return usuario;
			}
		}
		return null;
	}
	
}
