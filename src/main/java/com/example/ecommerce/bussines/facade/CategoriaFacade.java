package com.example.ecommerce.bussines.facade;

import com.example.ecommerce.bussines.facade.Base.BaseFacade;
import com.example.ecommerce.domain.dtos.categoriaDto.CategoriaDto;
import com.example.ecommerce.domain.dtos.categoriaDto.CategoriaShortDto;

import java.util.List;

public interface CategoriaFacade extends BaseFacade<CategoriaDto, Long> {
    List<CategoriaDto> findAllCategoriasPadreBySucursalId(Long idSucursal);
    List<CategoriaDto> findAllCategoriasByEmpresaId( Long idEmpresa);
    List<CategoriaDto> findAllSubCategoriasByCategoriaPadreId(Long id);
    List<CategoriaShortDto> findAllCategoriasBySucursalId(Long idSucursal);
    List<CategoriaDto> findSubcategoriasBySucursalId( Long idSucursal);
}
