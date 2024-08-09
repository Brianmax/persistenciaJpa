package com.codigo.persistencia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "pasajeros")
@Entity
@Getter
@Setter
public class Pasajero {
    @Id
    @Column(name = "id_pasajero")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
}
