package com.dinobox.dinobox_backend.controller;

import com.dinobox.dinobox_backend.entity.Encomienda;
import com.dinobox.dinobox_backend.service.EncomiendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/encomiendas")
public class EncomiendaController {

    @Autowired
    private EncomiendaService encomiendaService;

    // Crear (POST)
    @PostMapping
    public Encomienda crearEncomienda(@RequestBody Encomienda encomienda) {
        return encomiendaService.guardar(encomienda);
    }

    // Listar todas (GET)
    @GetMapping
    public List<Encomienda> obtenerTodas() {
        return encomiendaService.obtenerTodas();
    }

    // Buscar por ID (GET)
    @GetMapping("/{id}")
    public Optional<Encomienda> obtenerPorId(@PathVariable Long id) {
        return encomiendaService.obtenerPorId(id);
    }

    // Buscar por código de seguimiento (GET)
    @GetMapping("/codigo/{codigoSeguimiento}")
    public Optional<Encomienda> obtenerPorCodigoSeguimiento(@PathVariable String codigoSeguimiento) {
        return encomiendaService.obtenerPorCodigoSeguimiento(codigoSeguimiento);
    }

    // Actualizar (PUT)
    @PutMapping("/{id}")
    public Encomienda actualizarEncomienda(@PathVariable Long id, @RequestBody Encomienda encomienda) {
        encomienda.setId(id);
        return encomiendaService.actualizar(encomienda);
    }

    // Eliminar (opcional)
    @DeleteMapping("/{id}")
    public void eliminarEncomienda(@PathVariable Long id) {
        encomiendaService.eliminar(id);
    }
}
