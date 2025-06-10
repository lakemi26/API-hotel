package com.fiap.hotel.exception;

public class MenorDeIdadeException extends RuntimeException{

    public MenorDeIdadeException (){
        super("Menores de idade não podem fazer reserva");
    }


}
