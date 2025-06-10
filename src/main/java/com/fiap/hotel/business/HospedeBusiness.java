package com.fiap.hotel.business;

import com.fiap.hotel.domain.Hospede;
import com.fiap.hotel.exception.MenorDeIdadeException;
import com.fiap.hotel.service.HospedeService;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HospedeBusiness {

    @Autowired
    private HospedeService hospedeService;

    public Hospede create (Hospede hospede){
        if(hospede.getDataNascimento().isAfter(ChronoLocalDate.from(LocalDateTime.now().minusYears(18)))){
            throw new MenorDeIdadeException();
        }

        hospede.setId(null);
        Hospede hospedeCadastrado = hospedeService.salvar(hospede);

        return hospedeCadastrado;
    }

    public Hospede update(Hospede hospede){
        if (hospede.getDataNascimento().isAfter(ChronoLocalDate.from(LocalDateTime.now().minusYears(21)))){
            throw new MenorDeIdadeException();
        }

        Hospede hospedeCadastrado = hospedeService.salvar(hospede);

        return hospedeCadastrado;
    }

    public List<Hospede> findAll(){
        return hospedeService.findAll();
    }

    public List<Hospede>findByNomeOrEmailOrDocumento(String nome, String email, String documento){
        return hospedeService.findByNomeOrEmailOrDocumento(nome, email, documento);
    }
    

}
