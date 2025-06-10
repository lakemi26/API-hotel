package com.fiap.hotel.controller;

import com.fiap.hotel.business.HospedeBusiness;
import com.fiap.hotel.controller.dto.HospedeDTO;
import com.fiap.hotel.controller.dto.HospedeUsaDTO;
import com.fiap.hotel.domain.Hospede;
import com.fiap.hotel.mapper.HospedeMapper;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospede")
public class HospedeController {

    @Autowired
    private HospedeBusiness hospedeBusiness;

    private HospedeMapper mapper = HospedeMapper.INSTANCE;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public HospedeDTO create (@RequestBody @Valid HospedeDTO dto){
        Hospede hospedeCadastrado = hospedeBusiness.create(mapper.toDomain(dto));
        return mapper.toDTO(hospedeCadastrado);
    }

    @PostMapping("/usa")
    @ResponseStatus(HttpStatus.CREATED)
    public HospedeUsaDTO create (@RequestBody @Valid HospedeUsaDTO dto){
        Hospede hospedeCadastrado = hospedeBusiness.create(mapper.toDomain(dto));
        return mapper.toUsaDTO(hospedeCadastrado);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public HospedeDTO update(@RequestBody @Valid HospedeDTO dto) {
        Hospede hospedeAtualizado = hospedeBusiness.update(mapper.toDomain(dto));

        return mapper.toDTO(hospedeAtualizado);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<HospedeDTO>findAll(){
        List<Hospede> hospedes = hospedeBusiness.findAll();

        return mapper.toDTOList(hospedes);
    }

    

}
