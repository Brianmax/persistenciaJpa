package com.codigo.persistencia.service.impl;

import com.codigo.persistencia.entity.Pasajero;
import com.codigo.persistencia.repository.PasajeroRepository;
import com.codigo.persistencia.service.PasajeroService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PasajeroServiceImpl implements PasajeroService {
    private PasajeroRepository pasajeroRepository;

    public PasajeroServiceImpl(PasajeroRepository pasajeroRepository)
    {
        this.pasajeroRepository = pasajeroRepository;
    }
    @Override
    public Pasajero agregar(Pasajero pasajero) {
        // reglas de negocio
        Pasajero pasajeroBd = pasajeroRepository.save(pasajero);
        return pasajeroBd;
    }

    @Override
    public Pasajero buscarId(int id) {
        Optional<Pasajero> pasajeroOptional = pasajeroRepository.findById(id);
        if ( pasajeroOptional.isPresent() )
        {
            Pasajero pasajero = pasajeroOptional.get();
            return pasajero;
        }
        return null;
    }

    @Override
    public List<Pasajero> buscarNombre(String nombre) {
        List<Pasajero> pasajeros = pasajeroRepository.findByNombre(nombre);
        return pasajeros;
    }

    @Override
    public Pasajero actualizar(Pasajero pasajero) {
        return null;
    }

    @Override
    public void eliminar(int id) {

    }
}
