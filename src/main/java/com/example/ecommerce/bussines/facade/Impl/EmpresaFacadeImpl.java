package com.example.ecommerce.bussines.facade.Impl;


import com.example.ecommerce.bussines.facade.Base.BaseFacadeImp;
import com.example.ecommerce.bussines.facade.EmpresaFacade;
import com.example.ecommerce.bussines.mapper.BaseMapper;
import com.example.ecommerce.bussines.mapper.EmpresaMapper;
import com.example.ecommerce.bussines.services.EmpresaService;
import com.example.ecommerce.bussines.services.base.BaseService;
import com.example.ecommerce.domain.dtos.empresaDto.EmpresaDto;
import com.example.ecommerce.domain.dtos.empresaDto.EmpresaLargeDto;
import com.example.ecommerce.domain.entities.Empresa;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaFacadeImpl extends BaseFacadeImp<Empresa, EmpresaDto,Long> implements EmpresaFacade {

    public EmpresaFacadeImpl(BaseService<Empresa, Long> baseService, BaseMapper<Empresa, EmpresaDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    EmpresaMapper empresaMapper;


    @Autowired
    EmpresaService empresaService;



    @Override
    @Transactional
    public EmpresaLargeDto findWithSucursalesById(Long id) {
        return empresaMapper.toLargeDto(empresaService.findWithSucursalesById(id));
    }



}
