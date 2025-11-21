package com.dinobox.dinobox_backend.repository;

import com.dinobox.dinobox_backend.entity.Encomienda;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface EncomiendaRepository extends JpaRepository<Encomienda, Long> {
    Optional<Encomienda> findByCodigoSeguimiento(String codigoSeguimiento);
}
