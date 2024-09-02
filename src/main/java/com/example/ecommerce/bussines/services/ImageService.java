package com.example.ecommerce.bussines.services;

import com.example.ecommerce.domain.entities.ImagenBase;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.List;


public interface ImageService  {
    public ImagenBase save(MultipartFile file);
    public void deleteImage(Path filePath);
    public List<ImagenBase> saveAll(MultipartFile[] files);

}
