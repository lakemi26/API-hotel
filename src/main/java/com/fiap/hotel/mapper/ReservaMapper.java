package com.fiap.hotel.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fiap.hotel.controller.dto.ReservaDTO;
import com.fiap.hotel.domain.Reserva;
import com.fiap.hotel.repository.entity.ReservaEntity;


@Mapper
public interface ReservaMapper {

    ReservaMapper INSTANCE = Mappers.getMapper(ReservaMapper.class);

    Reserva toDomain(ReservaDTO dto);

    ReservaDTO toDTO(Reserva reserva);

    List<ReservaDTO> toDTO(List<Reserva> reserva);

    ReservaEntity toEntity(Reserva reserva);

    Reserva toDomain(ReservaEntity reservaEntity);

    List<Reserva> toDomain(List<ReservaEntity> reservaEntity);

}
