package com.example.ecommerce.bussines.facade.Impl;

import com.example.ecommerce.bussines.facade.AlergenoFacade;
import com.example.ecommerce.bussines.facade.Base.BaseFacadeImp;
import com.example.ecommerce.bussines.mapper.BaseMapper;
import com.example.ecommerce.bussines.services.base.BaseService;
import com.example.ecommerce.domain.dtos.alergeno.AlergenoDto;
import com.example.ecommerce.domain.entities.Alergeno;
import org.springframework.stereotype.Service;

@Service
public class AlergenoFacadeImpl extends BaseFacadeImp<Alergeno, AlergenoDto,Long> implements AlergenoFacade {
    public AlergenoFacadeImpl(BaseService<Alergeno, Long> baseService, BaseMapper<Alergeno, AlergenoDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
