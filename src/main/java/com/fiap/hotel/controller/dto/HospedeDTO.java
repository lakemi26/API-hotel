package com.fiap.hotel.controller.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HospedeDTO {

    private Long id;

    @NotEmpty
    private String nomeCompleto;

    @NotEmpty
    private String documento;

    @NotNull
    private LocalDate dataNascimento;

    private String enderecoCompleto;

    @NotEmpty
    private String email;

    private String ddd;

    private String telefone;

}
