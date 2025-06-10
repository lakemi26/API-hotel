package com.fiap.hotel.service;

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

    public Hospede cadastrarHospedeNoBD(Hospede hospede){
        HospedeEntity entity = repository.save(mapper.toEntity(hospede));
        return mapper.toDomain(entity);
    }


}
