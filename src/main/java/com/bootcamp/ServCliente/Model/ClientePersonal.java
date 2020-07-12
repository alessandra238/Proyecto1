package com.bootcamp.ServCliente.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="clientePersona")
public class ClientePersonal {

	@Id
	private String idCliente;
	
	private String nomCliente;
	private String apeCliente;
	private String docIdent;
	private String telefono;
	private String dirCliente;
	private String correoCliente;
	
	public ClientePersonal() {
		
	}
	
	public ClientePersonal(String nomCliente, String apeCliente, String docIdent, String telefono, String dirCliente, String correoCliente) {
		this.nomCliente = nomCliente;
		this.apeCliente = apeCliente;
		this.docIdent = docIdent;
		this.telefono = telefono;
		this.dirCliente = dirCliente;
		this.correoCliente = correoCliente;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomCliente() {
		return nomCliente;
	}

	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}

	public String getApeCliente() {
		return apeCliente;
	}

	public void setApeCliente(String apeCliente) {
		this.apeCliente = apeCliente;
	}

	public String getDocIdent() {
		return docIdent;
	}

	public void setDocIdent(String docIdent) {
		this.docIdent = docIdent;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDirCliente() {
		return dirCliente;
	}

	public void setDirCliente(String dirCliente) {
		this.dirCliente = dirCliente;
	}
	
	
	
	public String getCorreoCliente() {
		return correoCliente;
	}

	public void setCorreoCliente(String correoCliente) {
		this.correoCliente = correoCliente;
	}

	@Override
	public String toString() {
		return "Id del cliente: " + idCliente + ". Datos del Cliente: " + nomCliente + ", " + apeCliente +", "+ docIdent +", "+telefono + ", "+dirCliente;
	}
	
}
