package com.example.ecommerce.bussines.mapper;


import com.example.ecommerce.domain.dtos.paisDto.PaisDto;
import com.example.ecommerce.domain.entities.Pais;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaisMapper extends BaseMapper<Pais, PaisDto>{

}
