package com.bullseye.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bullseye.entidades.FuegoConAlmacen;

@RepositoryRestResource(path = "fuego", itemResourceRel = "fuego", collectionResourceRel = "fuegos")
public interface FuegoDAO extends JpaRepository<FuegoConAlmacen, Long>{
	
}
