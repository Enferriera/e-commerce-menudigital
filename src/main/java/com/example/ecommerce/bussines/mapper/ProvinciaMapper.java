package com.example.ecommerce.bussines.mapper;


import com.example.ecommerce.domain.dtos.provinciaDto.ProvinciaDto;
import com.example.ecommerce.domain.entities.Provincia;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {PaisMapper.class})
public interface ProvinciaMapper extends BaseMapper<Provincia, ProvinciaDto>{

}
