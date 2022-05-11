package com.bullseye.entidades;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.bullseye.repositorios.ArmaConDeposito;

import es.electromarket.Almacen;

@Entity
@Table(name = "DEPOSITOS")
public class DepositoConId extends Deposito{
	
	
	@OneToMany(cascade = CascadeType.ALL, targetEntity = ArmaConDeposito.class, mappedBy = "deposito")
	private Collection<ArmaConDeposito> armas;

	public Collection<ArmaConDeposito> getArmas() {
		return armas;
	}

	public void setArmas(Collection<ArmaConDeposito> armas) {
		this.armas = armas;
	}
	
	public DepositoConId() {}
	
	public DepositoConId(Collection<ArmaConDeposito> armas) {
		super();
		this.armas=armas;
	}
	
	public void addArmaConDeposito(ArmaConDeposito armaConDeposito) {
		getArmas().add(armaConDeposito);
		armaConDeposito.setAlmacen(this);
	}


}
