package com.example.ecommerce.bussines.services;

import com.example.ecommerce.bussines.services.base.BaseService;
import com.example.ecommerce.domain.entities.Categoria;
import com.example.ecommerce.domain.entities.Sucursal;
import org.mapstruct.Named;

import java.util.List;
import java.util.Set;

public interface SucursalService extends BaseService<Sucursal, Long> {
    List<Categoria> findCategoriasBySucursalId(Long sucursalId);

    @Named("getSucursalesByEmpresaId")
    Set<Sucursal> findAllByEmpresaId(Long id);
}
