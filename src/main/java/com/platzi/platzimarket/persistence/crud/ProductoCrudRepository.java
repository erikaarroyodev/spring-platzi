package com.platzi.platzimarket.persistence.crud;

import com.platzi.platzimarket.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Long> {
    List<Producto> findByIdCategoriaOrderByNombreDesc(Long idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(Integer cantidadStock, boolean estado);
}
