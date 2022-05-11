package com.bullseye.rest;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class MixIns {
	
	@JsonPropertyOrder({"idAlmacen", "tipo_producto", "id", "marca", "modelo", "calificacionEnergetica","numeroPulgadas", "capacidadCarga", "precio" })
	public static interface ArmaConDeposito {
		
	}

}
