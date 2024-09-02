package com.example.ecommerce.bussines.services.Impl;

import com.example.ecommerce.bussines.services.ImageService;
import com.example.ecommerce.bussines.services.ImagenAlergenoService;
import com.example.ecommerce.bussines.services.base.BaseServiceImp;
import com.example.ecommerce.domain.entities.ImagenAlergeno;
import com.example.ecommerce.repositories.ImagenAlergenoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class ImagenAlergenoServiceImpl extends BaseServiceImp<ImagenAlergeno,Long> implements ImagenAlergenoService {

    @Autowired
    private ImagenAlergenoRepository imagenAlergenoRepository;
    @Autowired
    private ImageService imageService;

    @Override
    @Transactional
    public void deleteById(Long id) {
        var imagenArticulo = imagenAlergenoRepository.getById(id);
        Path filePath = Paths.get(imagenArticulo.getUrl());
        imageService.deleteImage(filePath);
        imagenAlergenoRepository.delete(imagenArticulo);

    }


}
