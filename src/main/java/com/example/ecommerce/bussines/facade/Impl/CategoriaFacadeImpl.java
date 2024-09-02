package com.example.ecommerce.bussines.facade.Impl;

import com.example.ecommerce.bussines.facade.Base.BaseFacadeImp;
import com.example.ecommerce.bussines.facade.CategoriaFacade;
import com.example.ecommerce.bussines.mapper.BaseMapper;
import com.example.ecommerce.bussines.mapper.CategoriaMapper;
import com.example.ecommerce.bussines.services.CategoriaService;
import com.example.ecommerce.bussines.services.base.BaseService;
import com.example.ecommerce.domain.dtos.categoriaDto.CategoriaDto;
import com.example.ecommerce.domain.dtos.categoriaDto.CategoriaShortDto;
import com.example.ecommerce.domain.entities.Categoria;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaFacadeImpl extends BaseFacadeImp<Categoria, CategoriaDto, Long> implements CategoriaFacade {
    public CategoriaFacadeImpl(BaseService<Categoria, Long> baseService, BaseMapper<Categoria, CategoriaDto> baseMapper) {
        super(baseService, baseMapper);
    }
    @Autowired
    private CategoriaService categoriaService;

    @Autowired
    private CategoriaMapper categoriaMapper;

    @Override
    public List<CategoriaDto> findAllCategoriasPadreBySucursalId(Long idSucursal) {
        return baseMapper.toDTOsList(categoriaService.findAllCategoriasPadreBySucursalId(idSucursal));
    }





    @Override
    public List<CategoriaDto> findAllCategoriasByEmpresaId( Long idEmpresa){
        return baseMapper.toDTOsList(categoriaService.findAllCategoriasByEmpresaId(idEmpresa));
    }



    @Override
    public List<CategoriaDto> findAllSubCategoriasByCategoriaPadreId(Long id) {
        return baseMapper.toDTOsList(categoriaService.findAllSubCategoriasByCategoriaPadreId(id));
    }

    @Override
    public  List<CategoriaShortDto> findAllCategoriasBySucursalId(Long idSucursal){
        return categoriaMapper.toShortDTOs(categoriaService.findAllCategoriasBySucursalId(idSucursal));
    }

    @Override
    public  List<CategoriaDto> findSubcategoriasBySucursalId( Long idSucursal){
        return baseMapper.toDTOsList(categoriaService.findSubcategoriasBySucursalId(idSucursal));
    }
}
