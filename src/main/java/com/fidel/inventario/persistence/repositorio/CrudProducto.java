package com.fidel.inventario.persistence.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.fidel.inventario.persistence.entidad.Producto;

public interface CrudProducto extends CrudRepository<Producto, Long>{
    
}
