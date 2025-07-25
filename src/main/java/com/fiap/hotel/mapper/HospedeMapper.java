package com.fiap.hotel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.fiap.hotel.domain.Hospede;
import com.fiap.hotel.repository.entity.HospedeEntity;
import com.fiap.hotel.controller.dto.HospedeDTO;
import com.fiap.hotel.controller.dto.HospedeUsaDTO;

import static org.mapstruct.factory.Mappers.getMapper;

import java.util.List;

@Mapper
public interface HospedeMapper {
    HospedeMapper INSTANCE = getMapper(HospedeMapper.class);

    @Mapping(target = "dataCriacao", ignore = true)
    @Mapping(target = "dataAtualizacao", ignore = true)
    Hospede toDomain(HospedeDTO dto);

    @Mapping(target = "telefone", source = "phone")
    @Mapping(target = "nomeCompleto", source = "name")
    @Mapping(target = "enderecoCompleto", source = "address")
    @Mapping(target = "documento", source = "document")
    @Mapping(target = "ddd", ignore = true)
    @Mapping(target = "dataNascimento", source = "birthdate")
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "dataCriacao", ignore = true)
    @Mapping(target = "dataAtualizacao", ignore = true)
    Hospede toDomain(HospedeUsaDTO dto);

    HospedeDTO toDTO(Hospede domain);

    @Mapping(target = "address", source = "enderecoCompleto")
    @Mapping(target = "document", source = "documento")
    @Mapping(target = "name", source = "nomeCompleto")
    @Mapping(target = "phone", source = "telefone")
    @Mapping(target = "birthdate", source = "dataNascimento")
    HospedeUsaDTO toUsaDTO(Hospede domain);

    HospedeEntity toEntity(Hospede domain);

    Hospede toDomain(HospedeEntity entity);

    List<Hospede> toDomainList(List<HospedeEntity> entities);

    List<HospedeDTO> toDTOList(List<Hospede> domains);
}
