package com.fiap.hotel.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.hotel.repository.entity.ReservaEntity;

@Repository
public interface ReservaRepository extends JpaRepository<ReservaEntity, Integer>{

    List<ReservaEntity> findByDataEntradaOrDataSaidaOrStatus(LocalDate dataEntrada, LocalDate dataSaida, ReservaEntity.Status status);

}
