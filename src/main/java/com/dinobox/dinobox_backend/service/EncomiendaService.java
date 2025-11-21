package com.dinobox.dinobox_backend.service;

import com.dinobox.dinobox_backend.entity.Encomienda;
import com.dinobox.dinobox_backend.repository.EncomiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EncomiendaService {

    @Autowired
    private EncomiendaRepository encomiendaRepository;

    // Crear nueva encomienda
    public Encomienda guardar(Encomienda encomienda) {
        return encomiendaRepository.save(encomienda);
    }

    // Listar todas las encomiendas
    public List<Encomienda> obtenerTodas() {
        return encomiendaRepository.findAll();
    }

    // Buscar por id
    public Optional<Encomienda> obtenerPorId(Long id) {
        return encomiendaRepository.findById(id);
    }

    // Buscar por código de seguimiento
    public Optional<Encomienda> obtenerPorCodigoSeguimiento(String codigo) {
        return encomiendaRepository.findByCodigoSeguimiento(codigo);
    }

    // Actualizar encomienda existente
    public Encomienda actualizar(Encomienda encomienda) {
        return encomiendaRepository.save(encomienda);
    }

    // Eliminar una encomienda por id 
    public void eliminar(Long id) {
        encomiendaRepository.deleteById(id);
    }
}
