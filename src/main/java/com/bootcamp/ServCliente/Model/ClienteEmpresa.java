package com.bootcamp.ServCliente.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="clienteEmpresa")
public class ClienteEmpresa {

	@Id
	private String idEmpresa;
	
	private String nomEmpresa;
	private String ruc;
	private String repLegal;
	private String dniRep;
	private String dirEmpresa;
	private String telfEmpresa;
	private String correoEmpresa;
	private String correoRep;
	
	public ClienteEmpresa() {
		
	}
	
	public ClienteEmpresa(String nomEmpresa, String ruc, String repLegal, String dniRep, String dirEmpresa, String telfEmpresa, String correoEmpresa, String correoRep) {
		this.nomEmpresa = nomEmpresa;
		this.ruc = ruc;
		this.repLegal = repLegal;
		this.dniRep = dniRep;
		this.dirEmpresa = dirEmpresa;
		this.telfEmpresa = telfEmpresa;
		this.correoEmpresa = correoEmpresa;
		this.correoRep = correoRep;
	}

	public String getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNomEmpresa() {
		return nomEmpresa;
	}

	public void setNomEmpresa(String nomEmpresa) {
		this.nomEmpresa = nomEmpresa;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getRepLegal() {
		return repLegal;
	}

	public void setRepLegal(String repLegal) {
		this.repLegal = repLegal;
	}

	public String getDniRep() {
		return dniRep;
	}

	public void setDniRep(String dniRep) {
		this.dniRep = dniRep;
	}

	public String getDirEmpresa() {
		return dirEmpresa;
	}

	public void setDirEmpresa(String dirEmpresa) {
		this.dirEmpresa = dirEmpresa;
	}

	public String getTelfEmpresa() {
		return telfEmpresa;
	}

	public void setTelfEmpresa(String telfEmpresa) {
		this.telfEmpresa = telfEmpresa;
	}

	public String getCorreoEmpresa() {
		return correoEmpresa;
	}

	public void setCorreoEmpresa(String correoEmpresa) {
		this.correoEmpresa = correoEmpresa;
	}

	public String getCorreoRep() {
		return correoRep;
	}

	public void setCorreoRep(String correoRep) {
		this.correoRep = correoRep;
	}
	
	
	
	
}
