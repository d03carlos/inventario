package com.fidel.inventario.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import com.fidel.inventario.domain.entity.Product;
import com.fidel.inventario.domain.repository.ProductRepository;
import com.fidel.inventario.persistence.entidad.Producto;
import com.fidel.inventario.persistence.mapper.ProductMapper;
import com.fidel.inventario.persistence.repositorio.CrudProducto;

@Repository
public class ProductoRepository implements ProductRepository{
    @Autowired
    private CrudProducto crudProducto;
    @Autowired
    private ProductMapper mapper;

    @Override
    public List<Product> getAll() {
        List<Producto> productos = (List<Producto>) crudProducto.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public ResponseEntity<Product> getById(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public ResponseEntity<Product> save(Product product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public ResponseEntity<Product> delete(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
