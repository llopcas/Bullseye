package com.bullseye.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.bullseye.repositorios.ArmaConDeposito;

import es.electromarket.TelevisorInterfaz;

@Entity
public class FuegoConAlmacen extends ArmaConDeposito implements TelevisorInterfaz {

	
	@Column(name = "TAMAÑO_PANTALLA")
	private int numeroPulgadas;

	@Override
	public int getNumeroPulgadas() {
		return numeroPulgadas;
	}

	@Override
	public void setNumeroPulgadas(int numeroPulgadas) {
		this.numeroPulgadas = numeroPulgadas;
		
	}
	
	public FuegoConAlmacen() {}
	
	public FuegoConAlmacen(int numeroPulgadas) {
		super();
		this.numeroPulgadas = numeroPulgadas;
	}
}
