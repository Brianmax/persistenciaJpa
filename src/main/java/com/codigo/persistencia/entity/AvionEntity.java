package com.codigo.persistencia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Table(name = "aviones")
@Entity
public class AvionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int capacidad;
    private String modelo;

    @ManyToMany(mappedBy = "aviones")
    private List<PilotoEntity> pilotoEntities;
}
