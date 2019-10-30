package br.com.bancobrasil.model;

import javax.persistence.*;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String login;
	private String password;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

}
