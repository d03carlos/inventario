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
public class ProductoRepository implements ProductRepository {
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
        Producto producto = crudProducto.findById(id).orElse(null);
        if (producto != null) {
            return ResponseEntity.ok(mapper.toProduct(producto));
        }
        return ResponseEntity.notFound().build();

    }

    @Override
    public ResponseEntity<Product> save(Product product) {
        Producto producto = mapper.toProducto(product);
        return ResponseEntity.ok(mapper.toProduct(crudProducto.save(producto)));
    }

    @Override
    public ResponseEntity<Product> delete(long id) {
        Producto producto = crudProducto.findById(id).orElse(null);
        if (producto != null) {
            crudProducto.delete(producto);
            return ResponseEntity.ok(mapper.toProduct(producto));
        }
        return ResponseEntity.notFound().build();
    }

}
