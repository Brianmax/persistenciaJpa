package com.codigo.persistencia.controller;

import com.codigo.persistencia.entity.Pasajero;
import com.codigo.persistencia.service.PasajeroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/buscar/{id}")
    public ResponseEntity<Pasajero> buscarId(@PathVariable int id)
    {
        Pasajero pasajero = pasajeroService.buscarId(id);
        if (pasajero == null)
        {
            return ResponseEntity.notFound().build();
        }
        else {
            return ResponseEntity.ok().body(pasajero);
        }
    }
}
