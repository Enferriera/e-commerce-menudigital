package com.example.ecommerce.bussines.mapper;

import com.example.ecommerce.domain.dtos.alergeno.AlergenoDto;
import com.example.ecommerce.domain.entities.Alergeno;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses= {ImagenAlergenoMapper.class})
public interface AlergenoMapper extends BaseMapper<Alergeno, AlergenoDto> {
}
