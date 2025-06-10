package com.fiap.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.hotel.domain.Hospede;
import com.fiap.hotel.mapper.HospedeMapper;
import com.fiap.hotel.repository.HospedeRepository;
import com.fiap.hotel.repository.entity.HospedeEntity;

@Service
public class HospedeService {

    @Autowired
    private HospedeRepository repository;

    private HospedeMapper mapper = HospedeMapper.INSTANCE;

    public Hospede salvar(Hospede hospede){
        HospedeEntity entity = repository.save(mapper.toEntity(hospede));
        return mapper.toDomain(entity);
    }

    public List<Hospede>findAll(){
        List<HospedeEntity> hospedes = repository.findAll();

        return mapper.toDomainList(hospedes);
    }

    public List<Hospede> findByNomeOrEmailOrDocumento(String nome, String email, String documento){
        List<HospedeEntity> hospedes = repository.findByNomeCompletoOrEmailOrDocumento(nome, email, documento);

        return mapper.toDomainList(hospedes);
    }


}
