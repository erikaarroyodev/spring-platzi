package com.platzi.platzimarket.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @Column(name = "id_categoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    private Boolean estado;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    public Long getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
