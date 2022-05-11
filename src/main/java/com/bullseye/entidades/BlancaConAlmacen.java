package com.bullseye.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.bullseye.repositorios.ArmaConDeposito;

import es.electromarket.LavadoraInterfaz;

@Entity
public class BlancaConAlmacen extends ArmaConDeposito implements LavadoraInterfaz {
	
	@Column( name = "CAPACIDAD_DE_CARGA")
	private int capacidadCarga;

	
	@Override
	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	@Override
	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
		
	}
	
	public BlancaConAlmacen() {}
	
	public BlancaConAlmacen(int capacidadCarga) {
		super();
		this.capacidadCarga= capacidadCarga;
		
	}

}
