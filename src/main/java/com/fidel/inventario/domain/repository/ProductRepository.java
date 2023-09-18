package com.fidel.inventario.domain.repository;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.fidel.inventario.domain.entity.Product;

public interface ProductRepository {
    List<Product> getAll();
    ResponseEntity<Product> getById(long id);
    ResponseEntity<Product> save(Product product);
    //ResponseEntity<Product> update(long id, Product product);
    ResponseEntity<Product> delete(long id);
}
