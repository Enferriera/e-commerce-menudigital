package com.example.ecommerce.bussines.facade;


import com.example.ecommerce.bussines.facade.Base.BaseFacade;
import com.example.ecommerce.domain.dtos.localidadDto.LocalidadDto;

import java.util.List;

public interface LocalidadFacade extends BaseFacade<LocalidadDto, Long> {

    List<LocalidadDto> findByProvinciaId(Long id);
}
