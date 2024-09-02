package com.example.ecommerce.bussines.facade;



import com.example.ecommerce.bussines.facade.Base.BaseFacade;
import com.example.ecommerce.domain.dtos.sucursalDto.SucursalDto;

import java.util.List;

public interface SucursalFacade extends BaseFacade<SucursalDto, Long> {

    List<SucursalDto> findAllByEmpresaId( Long id);
}
