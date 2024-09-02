package com.example.ecommerce.bussines.services.Impl;

import com.example.ecommerce.bussines.services.EmpresaService;
import com.example.ecommerce.bussines.services.ImageService;
import com.example.ecommerce.bussines.services.SucursalService;
import com.example.ecommerce.bussines.services.base.BaseServiceImp;
import com.example.ecommerce.domain.entities.Empresa;
import com.example.ecommerce.repositories.EmpresaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class EmpresaServiceImpl extends BaseServiceImp<Empresa,Long> implements EmpresaService {

    @Autowired
    SucursalService sucursalService;

    @Autowired
    EmpresaRepository empresaRepository;

    @Autowired
    private ImageService imageService;

    @Value("${image.folder.path}")
    private String uploadDir;


    @Override
    public Empresa findWithSucursalesById(Long id) {
        return empresaRepository.findWithSucursalesById(id);
    }



    @Override
    public Empresa getById(Long id) {
        Empresa empresa = empresaRepository.getById(id);
        if (empresa==null) {
            throw new RuntimeException("No se existe la empresa con el id: " + id );
        }
        return empresaRepository.getById(id);
    }
}
