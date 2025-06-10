package com.fiap.hotel.business;

import com.fiap.hotel.domain.Hospede;
import com.fiap.hotel.exception.MenorDeIdadeException;
import com.fiap.hotel.service.HospedeService;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;

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

        return hospedeService.cadastrarHospedeNoBD(hospede);
    }
    

}
