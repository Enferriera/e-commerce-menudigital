package com.example.ecommerce.bussines.services.Impl;

import com.example.ecommerce.bussines.services.LocalidadService;
import com.example.ecommerce.bussines.services.base.BaseServiceImp;
import com.example.ecommerce.domain.entities.Localidad;
import com.example.ecommerce.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImp<Localidad,Long> implements LocalidadService {
    @Autowired
    LocalidadRepository localidadRepository;

    @Override
    public List<Localidad> findByProvinciaId(Long id) {
        return localidadRepository.findByProvinciaId(id);
    }
}
