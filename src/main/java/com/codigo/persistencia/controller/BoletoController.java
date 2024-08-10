package com.codigo.persistencia.controller;

import com.codigo.persistencia.entity.BoletoEntity;
import com.codigo.persistencia.request.BoletoRequest;
import com.codigo.persistencia.service.BoletoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/boleto")
public class BoletoController {
    private BoletoService boletoService;

    public BoletoController(BoletoService boletoService)
    {
        this.boletoService = boletoService;
    }

    @PostMapping("/crear")
    ResponseEntity<BoletoEntity> crearBoleto(@RequestBody BoletoRequest boletoRequest)
    {
        BoletoEntity respuestaService = boletoService.crearBoleto(boletoRequest);
        if (respuestaService!=null)
        {
            return ResponseEntity.ok().body(respuestaService);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/buscar/{id}")
    ResponseEntity<BoletoEntity> buscarBoleto(@PathVariable int id)
    {
        BoletoEntity respuestaService = boletoService.buscarId(id);

        if (respuestaService != null)
        {
            return ResponseEntity.ok().body(respuestaService);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
}
