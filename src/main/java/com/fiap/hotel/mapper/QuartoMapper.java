package com.fiap.hotel.mapper;

import java.util.List;

import com.fiap.hotel.controller.dto.QuartoDTO;
import com.fiap.hotel.domain.Quarto;
import com.fiap.hotel.repository.entity.QuartoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface QuartoMapper{

    QuartoMapper INSTANCE = Mappers.getMapper(QuartoMapper.class);

    QuartoDTO toDTO(Quarto quarto);

    Quarto toDomain(QuartoDTO dto);

    Quarto toDomain(QuartoEntity quartoEntity);

    List<QuartoDTO> toListDTO(List<Quarto> quartoList);

    QuartoEntity toEntity(Quarto quarto);

    List<Quarto> toListDomain(List<QuartoEntity> quartoEntityList);

}
