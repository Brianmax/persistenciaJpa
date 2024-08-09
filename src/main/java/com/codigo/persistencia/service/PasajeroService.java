package com.codigo.persistencia.service;

import com.codigo.persistencia.entity.Pasajero;

import java.util.List;

public interface PasajeroService {
    // agregar un pasajero
    // buscar por id
    // buscar por nombre
    // actualizar
    // eliminar
    Pasajero agregar(Pasajero pasajero);
    Pasajero buscarId(int id);
    List<Pasajero> buscarNombre(String nombre);
    Pasajero actualizar(Pasajero pasajero);
    void eliminar(int id);
}
