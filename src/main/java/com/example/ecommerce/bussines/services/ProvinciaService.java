package com.example.ecommerce.bussines.services;

import com.example.ecommerce.bussines.services.base.BaseService;
import com.example.ecommerce.domain.entities.Provincia;

import java.util.List;

public interface ProvinciaService extends BaseService<Provincia, Long> {
    List<Provincia> findByPaisId(Long id);
}
