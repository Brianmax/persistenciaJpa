package com.codigo.persistencia.service;

import com.codigo.persistencia.entity.BoletoEntity;
import com.codigo.persistencia.request.BoletoRequest;

import java.util.List;

public interface BoletoService {
    BoletoEntity crearBoleto(BoletoRequest boleto);
    BoletoEntity buscarId(int id);
    List<BoletoEntity> buscarTodos();
    BoletoEntity actualizarBoleto(BoletoEntity boletoEntity);
    void eliminarBoleto(int id);
}
