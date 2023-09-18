package com.fidel.inventario.persistence.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.fidel.inventario.domain.entity.Product;
import com.fidel.inventario.persistence.entidad.Producto;

@Mapper(componentModel = "spring")
public interface ProductMapper{
    @Mappings({
        @Mapping(source = "idProducto", target = "productId"),
        @Mapping(source = "descripcion", target = "name"),
        @Mapping(source = "precio", target = "price")
    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto> productos);
    @InheritInverseConfiguration
    Producto toProducto(Product product);
}
