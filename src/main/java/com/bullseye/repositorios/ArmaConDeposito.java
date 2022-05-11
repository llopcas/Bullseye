package com.bullseye.repositorios;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bullseye.entidades.DepositoConId;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import es.electromarket.Electrodomestico;

@Entity
@Table(name = "ARMAS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TIPO_ARMA", discriminatorType = DiscriminatorType.STRING)

public class ArmaConDeposito extends Arma {
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DEPOSITO")
	private DepositoConId deposito;

	public DepositoConId getAlmacen() {
		return deposito;
	}

	public void setAlmacen(DepositoConId almacen) {
		this.deposito = almacen;
	}
	
	public ArmaConDeposito() {}

	public ArmaConDeposito(DepositoConId almacen) {
		super();
		this.deposito = almacen;
	}
	
}
