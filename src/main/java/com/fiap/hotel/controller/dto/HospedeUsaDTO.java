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
public class HospedeUsaDTO {

    @NotEmpty
    private String name;

    @NotEmpty
    private String document;

    @NotNull
    private LocalDate birthdate;

    private String address;

    @NotEmpty
    private String email;


    private String phone;



}
