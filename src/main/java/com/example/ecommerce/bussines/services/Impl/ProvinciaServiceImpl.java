package com.example.ecommerce.bussines.services.Impl;

import com.example.ecommerce.bussines.services.ProvinciaService;
import com.example.ecommerce.bussines.services.base.BaseServiceImp;
import com.example.ecommerce.domain.entities.Provincia;
import com.example.ecommerce.repositories.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinciaServiceImpl extends BaseServiceImp<Provincia,Long> implements ProvinciaService {
    @Autowired
    ProvinciaRepository provinciaRepository;
    @Override
    public List<Provincia> findByPaisId(Long id) {
        return provinciaRepository.findByPaisId(id);
    }
}
