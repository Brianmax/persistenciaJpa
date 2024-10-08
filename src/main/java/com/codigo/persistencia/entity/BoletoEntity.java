package com.codigo.persistencia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "boletos")
@Entity
public class BoletoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_boleto")
    private int id;
    private int asiento;

    @ManyToOne
    @JoinColumn(name = "id_pasajero")
    private Pasajero pasajero;

    @ManyToOne
    @JoinColumn(name = "id_vuelo")
    private VueloEntity vueloEntity;

    // usuarioCreacion
    // fecha creacion
    // fecha modificacion
}
