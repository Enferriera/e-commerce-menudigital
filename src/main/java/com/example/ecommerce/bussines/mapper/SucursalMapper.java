package com.example.ecommerce.bussines.mapper;


import com.example.ecommerce.bussines.services.EmpresaService;
import com.example.ecommerce.bussines.services.SucursalService;
import com.example.ecommerce.domain.dtos.sucursalDto.SucursalDto;
import com.example.ecommerce.domain.dtos.sucursalDto.SucursalShortDto;
import com.example.ecommerce.domain.entities.Sucursal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {DomicilioMapper.class, EmpresaMapper.class, SucursalService.class, EmpresaService.class})
public interface SucursalMapper extends BaseMapper<Sucursal, SucursalDto>{

    public SucursalShortDto toShortDTO(Sucursal source);




}
