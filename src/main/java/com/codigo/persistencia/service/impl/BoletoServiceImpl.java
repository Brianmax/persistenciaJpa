package com.codigo.persistencia.service.impl;

import com.codigo.persistencia.entity.BoletoEntity;
import com.codigo.persistencia.entity.Pasajero;
import com.codigo.persistencia.repository.BoletoRepository;
import com.codigo.persistencia.repository.PasajeroRepository;
import com.codigo.persistencia.request.BoletoRequest;
import com.codigo.persistencia.service.BoletoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoletoServiceImpl implements BoletoService {
    private BoletoRepository boletoRepository;
    private PasajeroRepository pasajeroRepository;
    public BoletoServiceImpl(BoletoRepository boletoRepository, PasajeroRepository pasajeroRepository)
    {
        this.boletoRepository = boletoRepository;
        this.pasajeroRepository =  pasajeroRepository;
    }
    @Override
    public BoletoEntity crearBoleto(BoletoRequest boleto) {
        // logica de negocio
        // verificamos la existencia del pasajero
        Optional<Pasajero> pasajeroOptional = pasajeroRepository.findById(boleto.getIdPasajero());

        if (pasajeroOptional.isPresent())
        {
            // Pasajero pasajero = pasajeroOptional.get();
            BoletoEntity boletoEntity = new BoletoEntity();
            boletoEntity.setAsiento(boleto.getAsiento());
            boletoEntity.setPasajero(pasajeroOptional.get());
            return boletoRepository.save(boletoEntity);
        }
        else {
            return null;
        }
    }
    @Override
    public BoletoEntity buscarId(int id) {
        Optional<BoletoEntity> boletoOptional = boletoRepository.findById(id);

        if (boletoOptional.isPresent())
        {
            return boletoOptional.get();
        }
        else{
            return null;
        }
    }

    @Override
    public List<BoletoEntity> buscarTodos() {
        return List.of();
    }

    @Override
    public BoletoEntity actualizarBoleto(BoletoEntity boletoEntity) {
        return null;
    }

    @Override
    public void eliminarBoleto(int id) {

    }
}
