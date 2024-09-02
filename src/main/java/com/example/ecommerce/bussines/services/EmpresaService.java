package com.example.ecommerce.bussines.services;

import com.example.ecommerce.bussines.services.base.BaseService;
import com.example.ecommerce.domain.entities.Empresa;

public interface EmpresaService extends BaseService<Empresa, Long> {

    public Empresa findWithSucursalesById(Long id);
}
