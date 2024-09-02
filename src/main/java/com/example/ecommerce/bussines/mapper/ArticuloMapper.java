package com.example.ecommerce.bussines.mapper;


import com.example.ecommerce.bussines.services.AlergenoService;
import com.example.ecommerce.bussines.services.CategoriaService;
import com.example.ecommerce.domain.dtos.articuloDto.ArticuloDto;
import com.example.ecommerce.domain.dtos.articuloDto.ArticuloShortDto;
import com.example.ecommerce.domain.entities.Articulo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring",uses={ImagenArticuloMapper.class, CategoriaService.class, AlergenoMapper.class,CategoriaMapper.class, AlergenoService.class})
public interface ArticuloMapper extends BaseMapper<Articulo, ArticuloDto> {

    ArticuloShortDto toShortDTO(Articulo articulo);
}
