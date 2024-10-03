package com.example.ecommerce.bussines.services.Impl;

import com.example.ecommerce.bussines.services.ArticuloService;
import com.example.ecommerce.bussines.services.base.BaseServiceImp;
import com.example.ecommerce.domain.entities.Articulo;
import com.example.ecommerce.domain.entities.ImagenArticulo;
import com.example.ecommerce.repositories.ArticuloRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ArticuloServiceImpl extends BaseServiceImp<Articulo,Long> implements ArticuloService {

    @Autowired
    private ArticuloRepository articuloRepository;

    @Override
    public boolean existsArticuloByAlergeno(Long idAlergeno){
        return articuloRepository.existsArticuloByAlergeno(idAlergeno);
    }

    @Override
   public List<Articulo> findAllBySucursalId(Long idSucusal){
        return articuloRepository.findAllBySucursalId(idSucusal);
    }




    @Override
    public Page<Articulo> findAllBySucursalIdPaged(Long idSucursal, Pageable pageable){
        return articuloRepository.findAllBySucursalIdPaged(idSucursal,pageable);
    }


    @Override
    public List<Articulo> findAllByCategoriaId(Long idCategoria){
        return articuloRepository.findAllByCategoriaId(idCategoria);
    }

    @Override
    public Page<Articulo> findAllByCategoriaIdPaged(Long idCategoria, Pageable pageable){
        return articuloRepository.findAllByCategoriaIdPaged(idCategoria, pageable);
    }

    @Override
    public List<Articulo> findAllHabilitadoBySucursalId(Long sucursalId){
        return articuloRepository.findAllHabilitadoBySucursalId(sucursalId);
    }

    // Método para obtener todas las imágenes almacenadas
    @Override
    //pedimos el id para retornar solo las imagenes de un articulo
    public ResponseEntity<List<Map<String, Object>>> getAllImagesByArticuloId(Long id) {
        try {
            // Consultar todas las imágenes desde la base de datos
            List<ImagenArticulo> images = baseRepository.getById(id).getImagenes().stream().toList();
            List<Map<String, Object>> imageList = new ArrayList<>();

            // Convertir cada imagen en un mapa de atributos para devolver como JSON
            for (ImagenArticulo image : images) {
                Map<String, Object> imageMap = new HashMap<>();
                imageMap.put("id", image.getId());
                imageMap.put("name", image.getName());
                imageMap.put("url", image.getUrl());
                imageList.add(imageMap);
            }

            // Devolver la lista de imágenes como ResponseEntity con estado OK (200)
            return ResponseEntity.ok(imageList);
        } catch (Exception e) {
            e.printStackTrace();
            // Devolver un error interno del servidor (500) si ocurre alguna excepción
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }



}
