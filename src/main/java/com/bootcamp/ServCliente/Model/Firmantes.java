package com.bootcamp.ServCliente.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="firmantes")
public class Firmantes {

	private String docFirmante;
	private String nomFirmante;
	private String apeFirmante;
	private String telFirmante;
	private String dirFirmante;
	private String correoFirmante;
	
	public Firmantes() {
		
	}
	
	public Firmantes(String docFirmante, String nomFirmante, String apeFirmante, String telFirmante, String dirFirmante, String correoFirmante) {
		this.docFirmante = docFirmante;
		this.nomFirmante = nomFirmante;
		this.apeFirmante = apeFirmante;
		this.telFirmante = telFirmante;
		this.dirFirmante = dirFirmante;
		this.correoFirmante = correoFirmante;
	}
	
	public String getDocFirmante() {
		return docFirmante;
	}
	public void setDocFirmante(String docFirmante) {
		this.docFirmante = docFirmante;
	}
	public String getNomFirmante() {
		return nomFirmante;
	}
	public void setNomFirmante(String nomFirmante) {
		this.nomFirmante = nomFirmante;
	}
	public String getApeFirmante() {
		return apeFirmante;
	}
	public void setApeFirmante(String apeFirmante) {
		this.apeFirmante = apeFirmante;
	}
	public String getTelFirmante() {
		return telFirmante;
	}
	public void setTelFirmante(String telFirmante) {
		this.telFirmante = telFirmante;
	}
	public String getDirFirmante() {
		return dirFirmante;
	}
	public void setDirFirmante(String dirFirmante) {
		this.dirFirmante = dirFirmante;
	}
	public String getCorreoFirmante() {
		return correoFirmante;
	}
	public void setCorreoFirmante(String correoFirmante) {
		this.correoFirmante = correoFirmante;
	}
	
	
}
