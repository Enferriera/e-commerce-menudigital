package com.example.ecommerce.bussines.services;

import com.example.ecommerce.bussines.services.base.BaseService;
import com.example.ecommerce.domain.entities.Categoria;

import java.util.List;

public interface CategoriaService extends BaseService<Categoria, Long> {
    List<Categoria> findAllCategoriasPadreBySucursalId(Long idSucursal);

    List<Categoria> findAllCategoriasByEmpresaId( Long idEmpresa);
    List<Categoria> findAllSubCategoriasByCategoriaPadreId(Long id);

    List<Categoria> findAllCategoriasBySucursalId(Long idSucursal);

    List<Categoria> findSubcategoriasBySucursalId( Long idSucursal);
}
