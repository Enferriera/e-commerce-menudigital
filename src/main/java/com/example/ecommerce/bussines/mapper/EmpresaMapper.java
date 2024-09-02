package com.example.ecommerce.bussines.mapper;

import com.example.ecommerce.domain.dtos.empresaDto.EmpresaDto;
import com.example.ecommerce.domain.dtos.empresaDto.EmpresaLargeDto;
import com.example.ecommerce.domain.entities.Empresa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmpresaMapper extends BaseMapper<Empresa, EmpresaDto> {
    EmpresaLargeDto toLargeDto(Empresa empresa);
}
