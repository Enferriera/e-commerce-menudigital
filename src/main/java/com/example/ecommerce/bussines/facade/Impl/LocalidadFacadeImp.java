package com.example.ecommerce.bussines.facade.Impl;


import com.example.ecommerce.bussines.facade.Base.BaseFacadeImp;
import com.example.ecommerce.bussines.facade.LocalidadFacade;
import com.example.ecommerce.bussines.mapper.BaseMapper;
import com.example.ecommerce.bussines.services.LocalidadService;
import com.example.ecommerce.bussines.services.base.BaseService;
import com.example.ecommerce.domain.dtos.localidadDto.LocalidadDto;
import com.example.ecommerce.domain.entities.Localidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocalidadFacadeImp extends BaseFacadeImp<Localidad, LocalidadDto, Long> implements LocalidadFacade {
    public LocalidadFacadeImp(BaseService<Localidad, Long> baseService, BaseMapper<Localidad, LocalidadDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    LocalidadService localidadService;

    @Override
    public List<LocalidadDto> findByProvinciaId(Long id) {
            // trae una lista de entidades
            var entities = localidadService.findByProvinciaId(id);
            //  devuelve una lista de DTO
            return entities
                    .stream()
                    .map(baseMapper::toDTO)
                    .collect(Collectors.toList());
    }
}
