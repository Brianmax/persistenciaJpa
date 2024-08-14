package com.codigo.persistencia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.GenericArrayType;
import java.util.List;

@Getter
@Setter
@Table(name = "pilotos")
@Entity
public class PilotoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_piloto")
    private int id;
    private String nombre;
    private String apellido;
    private boolean estado;
    @ManyToMany
    @JoinTable(
            name = "aviones_pilotos",
            joinColumns = @JoinColumn(name = "id_piloto"),
            inverseJoinColumns = @JoinColumn(name = "id_avion")
    )
    private List<AvionEntity> aviones;
}
