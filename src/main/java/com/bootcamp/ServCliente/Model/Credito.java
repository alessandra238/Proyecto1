package com.bootcamp.ServCliente.Model;

import java.util.List;

public class Credito {

	private String idCredito;
	private String tipoCredito;
	private ClienteEmpresa clienteEmpresa;
	private ClientePersonal clientePersonal;
	private int limiteCredito;
	private int saldoCredito;
	private List<MovimientosCuentas> movimientos;
	
	public Credito() {
		
	}
	
	public Credito(String idCredito,String tipoCredito,ClienteEmpresa clienteEmpresa,ClientePersonal clientePersonal,int limiteCredito,int saldoCredito,List<MovimientosCuentas> movimientos) {
		this.idCredito = idCredito;
	}

	public String getIdCredito() {
		return idCredito;
	}

	public void setIdCredito(String idCredito) {
		this.idCredito = idCredito;
	}

	public String getTipoCredito() {
		return tipoCredito;
	}

	public void setTipoCredito(String tipoCredito) {
		this.tipoCredito = tipoCredito;
	}

	public ClienteEmpresa getClienteEmpresa() {
		return clienteEmpresa;
	}

	public void setClienteEmpresa(ClienteEmpresa clienteEmpresa) {
		this.clienteEmpresa = clienteEmpresa;
	}

	public ClientePersonal getClientePersonal() {
		return clientePersonal;
	}

	public void setClientePersonal(ClientePersonal clientePersonal) {
		this.clientePersonal = clientePersonal;
	}

	public int getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(int limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public int getSaldoCredito() {
		return saldoCredito;
	}

	public void setSaldoCredito(int saldoCredito) {
		this.saldoCredito = saldoCredito;
	}

	public List<MovimientosCuentas> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<MovimientosCuentas> movimientos) {
		this.movimientos = movimientos;
	}
	
	
}
