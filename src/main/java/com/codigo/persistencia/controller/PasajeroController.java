package com.codigo.persistencia.controller;

import com.codigo.persistencia.entity.Pasajero;
import com.codigo.persistencia.service.PasajeroService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pasajero")
public class PasajeroController {
    private PasajeroService pasajeroService;
    public PasajeroController(PasajeroService pasajeroService)
    {
        this.pasajeroService = pasajeroService;
    }
    @PostMapping("/agregar")
    public Pasajero agregarPasajero(@RequestBody Pasajero pasajero)
    {
        return pasajeroService.agregar(pasajero);
    }
}
