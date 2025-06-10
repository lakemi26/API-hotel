package com.fiap.hotel.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.hotel.repository.entity.QuartoEntity;

@Repository
public interface QuartoRepository extends JpaRepository<QuartoEntity, Integer>{

    Optional<QuartoEntity> findByNumeroQuarto(String numeroQuarto);

    List<QuartoEntity> findByStatusOrTipoQuartoOrNumeroQuarto(final QuartoEntity.Status status,final QuartoEntity.TipoQuarto tipoQuarto, final String numeroQuarto);

    Optional<QuartoEntity>findByIdAndNumeroQuarto(Integer Id , String numeroQuarto);



}
