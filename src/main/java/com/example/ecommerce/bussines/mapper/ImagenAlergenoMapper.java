package com.example.ecommerce.bussines.mapper;

import com.example.ecommerce.domain.dtos.ImagenDto;
import com.example.ecommerce.domain.entities.ImagenAlergeno;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ImagenAlergenoMapper extends BaseMapper<ImagenAlergeno, ImagenDto> {
}
