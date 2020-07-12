package com.bootcamp.ServCliente.Model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="cuentaBancaria")
public class CuentaBancaria {
	
	private String tipoCuenta;
	private String nroCuenta;
	private ClienteEmpresa clienteEmpresa;
	private ClientePersonal clientePersonal;
	private List<MovimientosCuentas> movimientos;
	private int saldoCuenta;
	private List<Titulares> titulares;
	private List<Firmantes> firmantes;
	
	public CuentaBancaria() {
		
	}
	
	public CuentaBancaria(String tipoCuenta, String nroCuenta, ClienteEmpresa clienteEmpresa, ClientePersonal clientePersonal,
			List<MovimientosCuentas> movimientos, int saldoCuenta, List<Titulares> titulares, List<Firmantes> firmantes) {
		this.tipoCuenta = tipoCuenta;
		this.nroCuenta = nroCuenta;
		this.clienteEmpresa = clienteEmpresa;
		this.clientePersonal = clientePersonal;
		this.movimientos = movimientos;
		this.saldoCuenta = saldoCuenta;
		this.titulares = titulares;
		this.firmantes = firmantes;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public String getNroCuenta() {
		return nroCuenta;
	}

	public void setNroCuenta(String nroCuenta) {
		this.nroCuenta = nroCuenta;
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

	public List<MovimientosCuentas> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<MovimientosCuentas> movimientos) {
		this.movimientos = movimientos;
	}

	public int getSaldoCuenta() {
		return saldoCuenta;
	}

	public void setSaldoCuenta(int saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}

	public List<Titulares> getTitulares() {
		return titulares;
	}

	public void setTitulares(List<Titulares> titulares) {
		this.titulares = titulares;
	}

	public List<Firmantes> getFirmantes() {
		return firmantes;
	}

	public void setFirmantes(List<Firmantes> firmantes) {
		this.firmantes = firmantes;
	}
	
	
}
