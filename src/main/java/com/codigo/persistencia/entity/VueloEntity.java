package com.codigo.persistencia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Table(name = "vuelos")
@Entity
public class VueloEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vuelo")
    private int id;
    @Column(name = "fecha_salida")
    private Date fechaSalida;
    @Column(name = "fecha_llegada")
    private Date fechaLlegada;
    private String origen;
    private String destino;

    @OneToMany(mappedBy = "vueloEntity" )
    List<BoletoEntity> boletos;

    @ManyToOne
    @JoinColumn(name = "id_avion")
    private AvionEntity avionEntity;
}
