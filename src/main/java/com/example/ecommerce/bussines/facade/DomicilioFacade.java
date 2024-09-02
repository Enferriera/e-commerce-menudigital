package com.example.ecommerce.bussines.facade;


import com.example.ecommerce.bussines.facade.Base.BaseFacade;
import com.example.ecommerce.domain.dtos.domicilioDto.DomicilioCreateDto;
import com.example.ecommerce.domain.dtos.domicilioDto.DomicilioDto;

public interface DomicilioFacade extends BaseFacade<DomicilioDto, Long> {
    public DomicilioDto createDomicilio(DomicilioCreateDto dto);
}
