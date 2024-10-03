package com.example.ecommerce.bussines.services;

import com.example.ecommerce.bussines.services.base.BaseService;
import com.example.ecommerce.domain.entities.Articulo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface ArticuloService extends BaseService<Articulo, Long> {
    boolean existsArticuloByAlergeno(Long idAlergeno);
    List<Articulo> findAllBySucursalId( Long idSucusal);
    Page<Articulo> findAllBySucursalIdPaged(Long idSucursal, Pageable pageable);
    List<Articulo> findAllByCategoriaId(Long idCategoria);
    Page<Articulo> findAllByCategoriaIdPaged(Long idCategoria, Pageable pageable);
    List<Articulo> findAllHabilitadoBySucursalId(Long sucursalId);

    public ResponseEntity<List<Map<String, Object>>> getAllImagesByArticuloId(Long id);

    }
