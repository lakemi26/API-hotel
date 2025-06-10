package com.fiap.hotel.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Hospede {

    private Integer id;

    private String nomeCompleto;

    private String documento;

    private LocalDate dataNascimento;

    private String enderecoCompleto;

    private String email;

    private String ddd;

    private String telefone;

    private LocalDateTime dataCriacao;

    private LocalDateTime dataAtualizacao;

    

}
