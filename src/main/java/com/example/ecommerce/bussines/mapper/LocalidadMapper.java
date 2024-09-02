package com.example.ecommerce.bussines.mapper;


import com.example.ecommerce.domain.dtos.localidadDto.LocalidadDto;
import com.example.ecommerce.domain.entities.Localidad;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ProvinciaMapper.class})
public interface LocalidadMapper extends BaseMapper<Localidad, LocalidadDto> {
}
