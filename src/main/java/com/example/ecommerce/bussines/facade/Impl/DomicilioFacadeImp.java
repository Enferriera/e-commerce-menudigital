package com.example.ecommerce.bussines.facade.Impl;


import com.example.ecommerce.bussines.facade.Base.BaseFacadeImp;
import com.example.ecommerce.bussines.facade.DomicilioFacade;
import com.example.ecommerce.bussines.mapper.BaseMapper;
import com.example.ecommerce.bussines.mapper.DomicilioMapper;
import com.example.ecommerce.bussines.services.base.BaseService;
import com.example.ecommerce.domain.dtos.domicilioDto.DomicilioCreateDto;
import com.example.ecommerce.domain.dtos.domicilioDto.DomicilioDto;
import com.example.ecommerce.domain.entities.Domicilio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioFacadeImp extends BaseFacadeImp<Domicilio, DomicilioDto, Long> implements DomicilioFacade {
    public DomicilioFacadeImp(BaseService<Domicilio, Long> baseService, BaseMapper<Domicilio, DomicilioDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private DomicilioMapper domicilioMapper;
    @Override
    public DomicilioDto createDomicilio(DomicilioCreateDto dto) {
        return baseMapper.toDTO(baseService.create(domicilioMapper.toEntityCreate(dto)));
    }

}
