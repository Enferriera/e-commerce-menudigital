package com.example.ecommerce.bussines.services;

import com.example.ecommerce.bussines.services.base.BaseService;
import com.example.ecommerce.domain.entities.Localidad;

import java.util.List;

public interface LocalidadService extends BaseService<Localidad, Long> {
    List<Localidad> findByProvinciaId(Long id);
}
