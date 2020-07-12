package com.bootcamp.ServCliente.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="titulares")
public class Titulares {
	
	private String docTitular;
	private String nomTitular;
	private String apeTitular;
	private String telTitular;
	private String dirTitular;
	private String correoTitular;
	
	public Titulares() {
		
	}
	
	public Titulares(String docTitular, String nomTitular, String apeTitular, String telTitular, String dirTitular, String correoTitular) {
		this.docTitular = docTitular;
		this.nomTitular = nomTitular;
		this.apeTitular = apeTitular;
		this.telTitular = telTitular;
		this.dirTitular = dirTitular;
		this.correoTitular = correoTitular;
	}

	public String getDocTitular() {
		return docTitular;
	}

	public void setDocTitular(String docTitular) {
		this.docTitular = docTitular;
	}

	public String getNomTitular() {
		return nomTitular;
	}

	public void setNomTitular(String nomTitular) {
		this.nomTitular = nomTitular;
	}

	public String getApeTitular() {
		return apeTitular;
	}

	public void setApeTitular(String apeTitular) {
		this.apeTitular = apeTitular;
	}

	public String getTelTitular() {
		return telTitular;
	}

	public void setTelTitular(String telTitular) {
		this.telTitular = telTitular;
	}

	public String getDirTitular() {
		return dirTitular;
	}

	public void setDirTitular(String dirTitular) {
		this.dirTitular = dirTitular;
	}

	public String getCorreoTitular() {
		return correoTitular;
	}

	public void setCorreoTitular(String correoTitular) {
		this.correoTitular = correoTitular;
	}
	
	

}
