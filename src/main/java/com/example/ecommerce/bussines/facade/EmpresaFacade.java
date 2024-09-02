package com.example.ecommerce.bussines.facade;


import com.example.ecommerce.bussines.facade.Base.BaseFacade;
import com.example.ecommerce.domain.dtos.empresaDto.EmpresaDto;
import com.example.ecommerce.domain.dtos.empresaDto.EmpresaLargeDto;

public interface EmpresaFacade extends BaseFacade<EmpresaDto, Long> {
    EmpresaLargeDto findWithSucursalesById(Long id);


}
