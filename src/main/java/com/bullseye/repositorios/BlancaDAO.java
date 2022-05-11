package com.bullseye.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bullseye.entidades.BlancaConAlmacen;

@RepositoryRestResource(path = "blanca", itemResourceRel = "blanca", collectionResourceRel = "blancas")
public interface BlancaDAO extends JpaRepository<BlancaConAlmacen, Long>{

}
