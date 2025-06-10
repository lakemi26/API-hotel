package com.fiap.hotel.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.fiap.hotel.exception.MenorDeIdadeException;

@ControllerAdvice
@ResponseBody
public class ControllerExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
        MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

        return errors;
    }

    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    @ExceptionHandler(MenorDeIdadeException.class)
    public Map<String, String> handleMenorDeIdadeExceptions(
            MenorDeIdadeException ex) {
        Map<String, String> errors = new HashMap<>();
        errors.put("erro", ex.getMessage());

        return errors;
    }

    // @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    // @ExceptionHandler(RegraDeNegocioException.class)
    // public Map<String, String> handleRegraDeNegocioExceptions(
    //         RegraDeNegocioException ex) {
    //     Map<String, String> errors = new HashMap<>();
    //     errors.put("erro", ex.getMessage());

    //     return errors;
    // }

}
