package com.fiap.hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.hotel.repository.entity.HospedeEntity;

public interface HospedeRepository extends JpaRepository<HospedeEntity, Integer>{

    List<HospedeEntity> findByNomeCompletoOrEmailOrDocumento(String nome, String email, String documento);

}
