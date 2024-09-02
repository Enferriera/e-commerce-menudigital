package com.example.ecommerce.bussines.facade;


import com.example.ecommerce.bussines.facade.Base.BaseFacade;
import com.example.ecommerce.domain.dtos.provinciaDto.ProvinciaDto;

import java.util.List;

public interface ProvinciaFacade extends BaseFacade<ProvinciaDto, Long> {
    List<ProvinciaDto> findByPaisId(Long id);
}
