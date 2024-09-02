package com.example.ecommerce.bussines.mapper;

import com.example.ecommerce.domain.dtos.ImagenDto;
import com.example.ecommerce.domain.entities.ImagenArticulo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ImagenArticuloMapper extends BaseMapper<ImagenArticulo, ImagenDto> {
}
