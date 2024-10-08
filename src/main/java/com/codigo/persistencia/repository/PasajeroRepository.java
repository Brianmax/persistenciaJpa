package com.codigo.persistencia.repository;

import com.codigo.persistencia.entity.Pasajero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PasajeroRepository extends JpaRepository<Pasajero, Integer> {
    List<Pasajero> findByNombre(String nombre);
}
