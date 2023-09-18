package com.fidel.inventario.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fidel.inventario.domain.entity.Product;
import com.fidel.inventario.domain.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    
    public List<Product> getAll(){
        return productRepository.getAll();
    }
    public ResponseEntity<Product> getById(long id){
        return productRepository.getById(id);
    }
    public ResponseEntity<Product> save(Product product){
        return productRepository.save(product);
    }
   
    public ResponseEntity<Product> delete(long id){
        return productRepository.delete(id);
    }

}
