package com.platzi.platzimarket.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    private String id;

    private String nombre;

    private String apellidos;

    private Double celular;

    private String direccion;

    private String correoElectronico;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;
}
