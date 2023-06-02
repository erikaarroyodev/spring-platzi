package com.platzi.platzimarket.persistence;

import com.platzi.platzimarket.domain.Product;
import com.platzi.platzimarket.domain.repository.ProductRepository;
import com.platzi.platzimarket.persistence.crud.ProductoCrudRepository;
import com.platzi.platzimarket.persistence.entity.Producto;
import com.platzi.platzimarket.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository {
    @Autowired
    private ProductoCrudRepository productoCrudRepository;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getAll() {
        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
        return productMapper.toProducts(productos);
    }

    @Override
    public Optional<List<Product>> getByCategory(Long categoryId) {
        return Optional.of(productMapper.toProducts(productoCrudRepository.findByIdCategoriaOrderByNombreDesc(categoryId)));
    }

    @Override
    public Optional<List<Product>> getScarseProducts(int quantity) {
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(quantity, true).map(productos -> productMapper.toProducts(productos));
    }

    @Override
    public Optional<Product> getProduct(Long productId) {
        return productoCrudRepository.findById(productId).map(producto -> productMapper.toProduct(producto));
    }

    @Override
    public Product save(Product product) {
        Producto producto = productMapper.toProducto(product);
        return productMapper.toProduct(productoCrudRepository.save(producto));
    }

    @Override
    public void deleteById(Long productId) {
        productoCrudRepository.deleteById(productId);
    }

    /*public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(Long idCategoria) {
        return productoCrudRepository.findByIdCategoriaOrderByNombreDesc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(Integer cantidad, boolean estado) {
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, estado);
    }

    public Optional<Producto> getProducto(Long idProducto) {
        return productoCrudRepository.findById(idProducto);
    }

    public Producto save(Producto producto) {
        return productoCrudRepository.save(producto);
    }

    public void delete(Long idProducto) {
        productoCrudRepository.deleteById(idProducto);
    }*/
}
