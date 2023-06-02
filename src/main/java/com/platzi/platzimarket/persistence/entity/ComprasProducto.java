package com.platzi.platzimarket.persistence.entity;

import com.platzi.platzimarket.persistence.entity.pks.ComprasProductoPk;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "compras_productos")
public class ComprasProducto {

    @EmbeddedId
    private ComprasProductoPk comprasProductoPk;

    private Long cantidad;

    private BigDecimal total;

    private Boolean estado;

    @ManyToOne
    @MapsId("idCompra")
    @JoinColumn(name = "id_compra")
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;

    public ComprasProductoPk getComprasProductoPk() {
        return comprasProductoPk;
    }

    public void setComprasProductoPk(ComprasProductoPk comprasProductoPk) {
        this.comprasProductoPk = comprasProductoPk;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
