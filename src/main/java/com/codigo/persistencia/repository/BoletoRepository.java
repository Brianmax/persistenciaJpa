package com.codigo.persistencia.repository;

import com.codigo.persistencia.entity.BoletoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoletoRepository extends JpaRepository<BoletoEntity, Integer> {
}
