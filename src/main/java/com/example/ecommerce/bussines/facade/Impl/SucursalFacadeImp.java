package com.example.ecommerce.bussines.facade.Impl;

import com.example.ecommerce.bussines.facade.Base.BaseFacadeImp;
import com.example.ecommerce.bussines.facade.SucursalFacade;
import com.example.ecommerce.bussines.mapper.BaseMapper;
import com.example.ecommerce.bussines.mapper.CategoriaMapper;
import com.example.ecommerce.bussines.mapper.SucursalMapper;
import com.example.ecommerce.bussines.services.SucursalService;
import com.example.ecommerce.bussines.services.base.BaseService;
import com.example.ecommerce.bussines.services.base.BaseServiceImp;
import com.example.ecommerce.domain.dtos.categoriaDto.CategoriaDto;
import com.example.ecommerce.domain.dtos.sucursalDto.SucursalDto;
import com.example.ecommerce.domain.entities.Sucursal;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SucursalFacadeImp extends BaseFacadeImp<Sucursal, SucursalDto, Long> implements SucursalFacade {
    private static final Logger logger = LoggerFactory.getLogger(BaseServiceImp.class);
    @Autowired
    SucursalService sucursalService;

    @Autowired
    CategoriaMapper categoriaMapper;
    @Autowired
    private SucursalMapper sucursalMapper;

    public SucursalFacadeImp(BaseService<Sucursal, Long> baseService, BaseMapper<Sucursal, SucursalDto> baseMapper) {
        super(baseService, baseMapper);
    }



    public List<CategoriaDto> findCategoriasBySucursalId(Long id) {
        // Busca una entidad por id
        var entities = sucursalService.findCategoriasBySucursalId(id);

        // convierte la entidad a DTO
        return entities
                .stream()
                .map(categoriaMapper::toDTO)
                .collect(Collectors.toList());
    }


    @Override
    public List<SucursalDto> findAllByEmpresaId(Long id) {
        var entities = sucursalService.findAllByEmpresaId(id);
        return entities
                .stream()
                .map(baseMapper::toDTO)
                .collect(Collectors.toList());
    }
}
