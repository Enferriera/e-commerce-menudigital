package com.example.ecommerce.bussines.facade.Impl;


import com.example.ecommerce.bussines.facade.Base.BaseFacadeImp;
import com.example.ecommerce.bussines.facade.PaisFacade;
import com.example.ecommerce.bussines.mapper.BaseMapper;
import com.example.ecommerce.bussines.services.base.BaseService;
import com.example.ecommerce.domain.dtos.paisDto.PaisDto;
import com.example.ecommerce.domain.entities.Pais;
import org.springframework.stereotype.Service;


@Service
public class PaisFacadeImp extends BaseFacadeImp<Pais, PaisDto,Long> implements PaisFacade {
    public PaisFacadeImp(BaseService<Pais, Long> baseService, BaseMapper<Pais, PaisDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
