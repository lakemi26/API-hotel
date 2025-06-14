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
public class ReservaDTO {

    private Integer id;

    @NotNull
    private Integer idHospede1;

    private Integer idHospede2;

    @NotEmpty
    private String numeroQuarto;

    @NotNull
    private LocalDate dataEntrada;

    private LocalDate dataSaida;

    private Status status;

    public enum Status {
        CONFIRMADA, CANCELADA, EM_ANDAMENTO
    }

}
