package com.codigo.persistencia.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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

    @JsonIgnore
    @OneToMany(mappedBy = "pasajero")
    private List<BoletoEntity> boletoEntities;
}
