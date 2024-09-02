package com.example.ecommerce.bussines.mapper;


import com.example.ecommerce.bussines.services.CategoriaService;
import com.example.ecommerce.bussines.services.SucursalService;
import com.example.ecommerce.domain.dtos.categoriaDto.CategoriaDto;
import com.example.ecommerce.domain.dtos.categoriaDto.CategoriaShortDto;
import com.example.ecommerce.domain.entities.Categoria;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ArticuloMapper.class, SucursalMapper.class, SucursalService.class, CategoriaService.class,DomicilioMapper.class})
public interface CategoriaMapper extends BaseMapper<Categoria, CategoriaDto>{

    CategoriaShortDto toShortDTO(Categoria source);
    List<CategoriaShortDto> toShortDTOs(List<Categoria> source);

}
